drop table if exists sys_region;
create table sys_region
(
    id   int auto_increment primary key,
    pid  int          default 0  not null comment '行政区域父ID，例如区县的pid指向市，市的pid指向省，省的pid则是0',
    name varchar(120) default '' not null comment '行政区域名称',
    type tinyint(3)   default 0  not null comment '行政区域类型，如如1则是省， 如果是2则是市，如果是3则是区县',
    code int          default 0  not null comment '行政区域编码'
)
    comment '行政区域表' charset = utf8mb4;
create index agency_id on sys_region (code);
create index parent_id on sys_region (pid);
create index region_type on sys_region (type);

drop table if exists sys_storage;
create table sys_storage
(
    id          int auto_increment primary key,
    `key`       varchar(63)          not null comment '文件的唯一索引',
    name        varchar(255)         not null comment '文件名',
    type        varchar(20)          not null comment '文件类型',
    size        int                  not null comment '文件大小',
    url         varchar(255)         null comment '文件访问链接',
    add_time    datetime             null comment '创建时间',
    update_time datetime             null comment '更新时间',
    deleted     tinyint(1) default 0 null comment '逻辑删除'
)
    comment '文件存储表' charset = utf8mb4;
create index `key` on sys_storage (`key`);

drop table if exists sys_log;
create table sys_log
(
    id          int auto_increment primary key,
    admin       varchar(45)          null comment '管理员',
    ip          varchar(45)          null comment '管理员地址',
    type        int                  null comment '操作分类',
    action      varchar(45)          null comment '操作动作',
    status      tinyint(1)           null comment '操作状态',
    result      varchar(127)         null comment '操作结果，或者成功消息，或者失败消息',
    comment     varchar(255)         null comment '补充信息',
    add_time    datetime             null comment '创建时间',
    update_time datetime             null comment '更新时间',
    deleted     tinyint(1) default 0 null comment '逻辑删除'
)
    comment '操作日志表';

drop table if exists topic;
create table topic
(
    id          int auto_increment primary key,
    title       varchar(255)  default '''' not null comment '专题标题',
    subtitle    varchar(255)  default '''' null comment '专题子标题',
    content     text                       null comment '专题内容，富文本格式',
    read_count  varchar(255)  default '1k' null comment '专题阅读量',
    pic_url     varchar(255)  default ''   null comment '专题图片',
    sort_order  int           default 100  null comment '排序',
    goods       varchar(1023) default ''   null comment '专题相关商品，采用JSON数组格式',
    add_time    datetime                   null comment '创建时间',
    update_time datetime                   null comment '更新时间',
    deleted     tinyint(1)    default 0    null comment '逻辑删除'
)
    comment '专题表' charset = utf8mb4;
create index topic_id on topic (id);

drop table if exists advert;
create table advert
(
    id          int auto_increment primary key,
    name        varchar(63)  default '' not null comment '广告标题',
    link        varchar(255) default '' not null comment '所广告的商品页面或者活动页面链接地址',
    url         varchar(255)            not null comment '广告宣传图片',
    content     varchar(255) default '' null comment '活动内容',
    start_time  datetime                null comment '广告开始时间',
    end_time    datetime                null comment '广告结束时间',
    enabled     tinyint(1)   default 0  null comment '是否启动',
    add_time    datetime                null comment '创建时间',
    update_time datetime                null comment '更新时间',
    deleted     tinyint(1)   default 0  null comment '逻辑删除'
)
    comment '广告表' charset = utf8mb4;
create index enabled on advert (enabled);

drop table if exists admin_role_permission;
create table admin_role_permission
(
    id          int auto_increment primary key,
    role_id     int                  null comment '角色ID',
    permission  varchar(63)          null comment '权限',
    add_time    datetime             null comment '创建时间',
    update_time datetime             null comment '更新时间',
    deleted     tinyint(1) default 0 null comment '逻辑删除'
)
    comment '权限表' charset = utf8mb4;


drop table if exists admin_role;
create table admin_role
(
    id          int auto_increment primary key,
    name        varchar(63)          not null comment '角色名称',
    `desc`      varchar(1023)        null comment '角色描述',
    enabled     tinyint(1) default 1 null comment '是否启用',
    add_time    datetime             null comment '创建时间',
    update_time datetime             null comment '更新时间',
    deleted     tinyint(1) default 0 null comment '逻辑删除',
    constraint name_UNIQUE
        unique (name)
)
    comment '角色表' charset = utf8mb4;

drop table if exists admin_notice;
create table admin_notice
(
    id          int auto_increment primary key,
    title       varchar(63)          null comment '通知标题',
    content     varchar(511)         null comment '通知内容',
    admin_id    int        default 0 null comment '创建通知的管理员ID，如果是系统内置通知则是0.',
    add_time    datetime             null comment '创建时间',
    update_time datetime             null comment '更新时间',
    deleted     tinyint(1) default 0 null comment '逻辑删除'
)
    comment '通知表' charset = utf8mb4;

drop table if exists admin_notice_reading_records;
create table admin_notice_reading_records
(
    id           int auto_increment primary key,
    notice_id    int                  null comment '通知ID',
    notice_title varchar(63)          null comment '通知标题',
    admin_id     int                  null comment '接收通知的管理员ID',
    read_time    datetime             null comment '阅读时间，如果是NULL则是未读状态',
    add_time     datetime             null comment '创建时间',
    update_time  datetime             null comment '更新时间',
    deleted      tinyint(1) default 0 null comment '逻辑删除'
)
    comment '通知管理员阅读表' charset = utf8mb4;

drop table if exists admin_user;
create table admin_user
(
    id              int auto_increment primary key,
    username        varchar(63)  default ''   not null comment '管理员名称',
    password        varchar(63)  default ''   not null comment '管理员密码',
    last_login_ip   varchar(63)  default ''   null comment '最近一次登录IP地址',
    last_login_time datetime                  null comment '最近一次登录时间',
    avatar          varchar(255) default '''' null comment '头像图片',
    add_time        datetime                  null comment '创建时间',
    update_time     datetime                  null comment '更新时间',
    deleted         tinyint(1)   default 0    null comment '逻辑删除',
    role_ids        varchar(127) default '[]' null comment '角色列表'
)
    comment '管理员表' charset = utf8mb4;

drop table if exists goods_refund;
create table goods_refund
(
    id           int auto_increment primary key,
    aftersale_sn varchar(63)                 null comment '售后编号',
    order_id     int                         not null comment '订单ID',
    user_id      int                         not null comment '用户ID',
    type         smallint       default 0    null comment '售后类型，0是未收货退款，1是已收货退款，2用户退货退款',
    reason       varchar(31)    default ''   null comment '退款原因',
    amount       decimal(10, 2) default 0.00 null comment '退款金额',
    pictures     varchar(1023)  default '[]' null comment '退款凭证图片链接数组',
    comment      varchar(511)   default ''   null comment '退款说明',
    status       smallint       default 0    null comment '售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消',
    handle_time  datetime                    null comment '管理员操作时间',
    add_time     datetime                    null comment '添加时间',
    update_time  datetime                    null comment '更新时间',
    deleted      tinyint(1)     default 0    null comment '售后编号'
)
    comment '商品退货表' charset = utf8mb4;

drop table if exists goods_brand;
create table goods_brand
(
    id          int auto_increment primary key,
    name        varchar(255) default '' not null comment '品牌商名称',
    `desc`      varchar(255) default '' not null comment '品牌商简介',
    pic_url     varchar(255) default '' not null comment '品牌商页的品牌商图片',
    add_time    datetime                null comment '创建时间',
    update_time datetime                null comment '更新时间',
    deleted     tinyint(1)   default 0  null comment '逻辑删除'
)
    comment '品牌商表' charset = utf8mb4;

drop table if exists goods_category;
create table goods_category
(
    id          int auto_increment primary key,
    name        varchar(63)   default ''   not null comment '类目名称',
    keywords    varchar(1023) default ''   not null comment '类目关键字，以JSON数组格式',
    `desc`      varchar(255)  default ''   null comment '类目广告语介绍',
    pid         int           default 0    not null comment '父类目ID',
    icon_url    varchar(255)  default ''   null comment '类目图标',
    pic_url     varchar(255)  default ''   null comment '类目图片',
    level       varchar(255)  default 'L1' null,
    sort_order  tinyint(3)    default 50   null comment '排序',
    add_time    datetime                   null comment '创建时间',
    update_time datetime                   null comment '更新时间',
    deleted     tinyint(1)    default 0    null comment '逻辑删除'
)
    comment '类目表' charset = utf8mb4;
create index parent_id
    on goods_category (pid);

drop table if exists goods_comment;
create table goods_comment
(
    id            int auto_increment primary key,
    goods_id      int        default 0 not null comment '商品ID',
    content       varchar(1023)        not null comment '评论内容',
    admin_content varchar(511)         not null comment '管理员回复内容',
    user_id       int        default 0 not null comment '用户表的用户ID',
    has_picture   tinyint(1) default 0 null comment '是否含有图片',
    pic_urls      varchar(1023)        null comment '图片地址列表，采用JSON数组格式',
    star          smallint   default 1 null comment '评分， 1-5',
    add_time      datetime             null comment '创建时间',
    update_time   datetime             null comment '更新时间',
    deleted       tinyint(1) default 0 null comment '逻辑删除'
)
    comment '评论表' charset = utf8mb4;
create index goods_id on goods_comment (goods_id);

drop table if exists goods_coupon;
create table goods_coupon
(
    id          int auto_increment primary key,
    name        varchar(63)                 not null comment '优惠券名称',
    `desc`      varchar(127)   default ''   null comment '优惠券介绍，通常是显示优惠券使用限制文字',
    tag         varchar(63)    default ''   null comment '优惠券标签，例如新人专用',
    total       int            default 0    not null comment '优惠券数量，如果是-1，则是无限量',
    discount    decimal(10, 2) default 0.00 null comment '优惠金额，',
    min         decimal(10, 2) default 0.00 null comment '最少消费金额才能使用优惠券。',
    `limit`     smallint       default 1    null comment '用户领券限制数量，如果是0，则是不限制；默认是1，限领一张.',
    type        smallint       default 0    null comment '优惠券赠送类型，如果是0则通用券，用户领取；如果是1，则是注册赠券；如果是2，则是优惠券码兑换；',
    status      smallint       default 0    null comment '优惠券状态，如果是0则是正常可用；如果是1则是过期; 如果是2则是下架。',
    goods_type  smallint       default 0    null comment '商品限制类型，如果0则全商品，如果是1则是类目限制，如果是2则是商品限制。',
    goods_value varchar(1023)  default '[]' null comment '商品限制值，goods_type如果是0则空集合，如果是1则是类目集合，如果是2则是商品集合。',
    code        varchar(63)                 null comment '优惠券兑换码',
    time_type   smallint       default 0    null comment '有效时间限制，如果是0，则基于领取时间的有效天数days；如果是1，则start_time和end_time是优惠券有效期；',
    days        smallint       default 0    null comment '基于领取时间的有效天数days。',
    start_time  datetime                    null comment '使用券开始时间',
    end_time    datetime                    null comment '使用券截至时间',
    add_time    datetime                    null comment '创建时间',
    update_time datetime                    null comment '更新时间',
    deleted     tinyint(1)     default 0    null comment '逻辑删除'
)
    comment '优惠券信息及规则表' charset = utf8mb4;
create index code on goods_coupon (code);

drop table if exists goods_detail;
create table goods_detail
(
    id            int auto_increment primary key,
    goods_sn      varchar(63)    default ''        not null comment '商品编号',
    name          varchar(127)   default ''        not null comment '商品名称',
    category_id   int            default 0         null comment '商品所属类目ID',
    brand_id      int            default 0         null comment '商品所属品牌ID',
    keywords      varchar(255)   default ''        null comment '商品关键字，采用逗号间隔',
    brief         varchar(255)   default ''        null comment '商品简介',
    gallery       varchar(1023)                    null comment '商品宣传图片列表，采用JSON数组格式',
    pic_url       varchar(255)                     null comment '商品页面商品图片',
    detail        text                             null comment '商品详细介绍，是富文本格式',
    share_url     varchar(255)                     null comment '商品分享朋友圈图片',
    is_on_sale    tinyint(1)     default 1         null comment '是否上架',
    is_new        tinyint(1)     default 0         null comment '是否新品首发，',
    is_hot        tinyint(1)     default 0         null comment '是否人气推荐',
    counter_price decimal(10, 2) default 0.00      null comment '指导销售价格',
    retail_price  decimal(10, 2) default 100000.00 null comment '实际销售价格',
    unit          varchar(31)    default '件'       null comment '商品单位，例如件、盒',
    sort_order    smallint(4)    default 100       null comment '排序',
    add_time      datetime                         null comment '创建时间',
    update_time   datetime                         null comment '更新时间',
    deleted       tinyint(1)     default 0         null comment '逻辑删除'
)
    comment '商品基本信息表' charset = utf8mb4;
create index brand_id on goods_detail (brand_id);
create index cat_id on goods_detail (category_id);
create index goods_sn on goods_detail (goods_sn);
create index sort_order on goods_detail (sort_order);

drop table if exists goods_attribute;
create table goods_attribute
(
    id          int auto_increment primary key,
    goods_id    int        default 0 not null comment '商品表的商品ID',
    attribute   varchar(255)         not null comment '商品参数名称',
    value       varchar(255)         not null comment '商品参数值',
    add_time    datetime             null comment '创建时间',
    update_time datetime             null comment '更新时间',
    deleted     tinyint(1) default 0 null comment '逻辑删除'
)
    comment '商品参数表' charset = utf8mb4;
create index goods_id on goods_attribute (goods_id);



drop table if exists goods_stock;
create table goods_stock
(
    id               int auto_increment primary key,
    goods_id         int        default 0 not null comment '商品表的商品ID',
    specification    varchar(50)          not null comment '商品规格',
    specification_id int                  null comment '商品规格Id',
    number           int        default 0 not null comment '商品货品数量',
    url              varchar(125)         null comment '商品货品图片',
    add_time         datetime             null comment '创建时间',
    update_time      datetime             null comment '更新时间',
    deleted          tinyint(1) default 0 null comment '逻辑删除'
)
    comment '商品货品表' charset = utf8mb4;
create index goods_id on goods_stock (goods_id);

drop table if exists goods_specification;
create table goods_specification
(
    id            int auto_increment primary key,
    goods_id      int          default 0  not null comment '商品表的商品ID',
    specification varchar(255) default '' not null comment '商品规格名称',
    pic_url       varchar(255) default '' not null comment '商品规格图片',
    add_time      datetime                null comment '创建时间',
    update_time   datetime                null comment '更新时间',
    deleted       tinyint(1)   default 0  null comment '逻辑删除'
)
    comment '商品规格表' charset = utf8mb4;
create index goods_id on goods_specification (goods_id);

drop table if exists goods_issue;
create table goods_issue
(
    id          int auto_increment primary key,
    goods_id    int        default 0 not null comment '商品表的商品ID',
    question    varchar(255)         null comment '问题标题',
    answer      varchar(255)         null comment '问题答案',
    add_time    datetime             null comment '创建时间',
    update_time datetime             null comment '更新时间',
    deleted     tinyint(1) default 0 null comment '逻辑删除'
)
    comment '商品常见问题表' charset = utf8mb4;


drop table if exists user;
create table user
(
    id              int auto_increment primary key,
    username        varchar(63)             not null comment '用户名称',
    password        varchar(63)  default '' not null comment '用户密码',
    gender          tinyint(3)   default 0  not null comment '性别：0 未知， 1男， 1 女',
    birthday        date                    null comment '生日',
    last_login_time datetime                null comment '最近一次登录时间',
    last_login_ip   varchar(63)  default '' not null comment '最近一次登录IP地址',
    user_level      tinyint(3)   default 0  null comment '0 普通用户，1 VIP用户，2 高级VIP用户',
    nickname        varchar(63)  default '' not null comment '用户昵称或网络名称',
    mobile          varchar(20)  default '' not null comment '用户手机号码',
    avatar          varchar(255) default '' not null comment '用户头像图片',
    weixin_openid   varchar(63)  default '' not null comment '微信登录openid',
    session_key     varchar(100) default '' not null comment '微信登录会话KEY',
    status          tinyint(3)   default 0  not null comment '0 可用, 1 禁用, 2 注销',
    add_time        datetime                null comment '创建时间',
    update_time     datetime                null comment '更新时间',
    deleted         tinyint(1)   default 0  null comment '逻辑删除',
    constraint user_name
        unique (username)
)
    comment '用户表' charset = utf8mb4;

drop table if exists user_order;
create table user_order
(
    id               int auto_increment primary key,
    user_id          int                     not null comment '用户表的用户ID',
    order_sn         varchar(63)             not null comment '订单编号',
    order_status     smallint                not null comment '订单状态',
    aftersale_status smallint     default 0  null comment '售后状态，0是可申请，1是用户已申请，2是管理员审核通过，3是管理员退款成功，4是管理员审核拒绝，5是用户已取消',
    consignee        varchar(63)             not null comment '收货人名称',
    mobile           varchar(63)             not null comment '收货人手机号',
    address          varchar(127)            not null comment '收货具体地址',
    message          varchar(512) default '' not null comment '用户订单留言',
    goods_price      decimal(10, 2)          not null comment '商品总费用',
    freight_price    decimal(10, 2)          not null comment '配送费用',
    coupon_price     decimal(10, 2)          null comment '优惠券减免',
    order_price      decimal(10, 2)          not null comment '订单费用， = goods_price + freight_price - coupon_price',
    actual_price     decimal(10, 2)          not null comment '实付费用， = order_price - integral_price',
    pay_id           varchar(63)             null comment '微信付款编号',
    pay_time         datetime                null comment '微信付款时间',
    ship_sn          varchar(63)             null comment '发货编号',
    ship_channel     varchar(63)             null comment '发货快递公司',
    ship_time        datetime                null comment '发货开始时间',
    confirm_time     datetime                null comment '用户确认收货时间',
    end_time         datetime                null comment '订单关闭时间',
    add_time         datetime                null comment '创建时间',
    update_time      datetime                null comment '更新时间',
    deleted          tinyint(1)   default 0  null comment '逻辑删除'
)
    comment '用户订单表' charset = utf8mb4;

drop table if exists user_order_goods_detail;
create table user_order_goods_detail
(
    id             int auto_increment
        primary key,
    order_id       int            default 0    not null comment '订单表的订单ID',
    goods_id       int            default 0    not null comment '商品表的商品ID',
    goods_name     varchar(127)   default ''   not null comment '商品名称',
    goods_sn       varchar(63)    default ''   not null comment '商品编号',
    number         smallint(5)    default 0    not null comment '商品货品的购买数量',
    price          decimal(10, 2) default 0.00 not null comment '商品货品的售价',
    specifications varchar(1023)               not null comment '商品货品的规格列表',
    pic_url        varchar(255)   default ''   not null comment '商品货品图片或者商品图片',
    comment        int            default 0    null comment '订单商品评论，如果是-1，则超期不能评价；如果是0，则可以评价；如果其他值，则是comment表里面的评论ID。',
    add_time       datetime                    null comment '创建时间',
    update_time    datetime                    null comment '更新时间',
    deleted        tinyint(1)     default 0    null comment '逻辑删除'
)
    comment '订单商品表' charset = utf8mb4;
create index goods_id on user_order_goods_detail (goods_id);
create index order_id on user_order_goods_detail (order_id);


drop table if exists admin_role_permission;
create table admin_role_permission
(
    id          int auto_increment primary key,
    role_id     int                  null comment '角色ID',
    permission  varchar(63)          null comment '权限',
    add_time    datetime             null comment '创建时间',
    update_time datetime             null comment '更新时间',
    deleted     tinyint(1) default 0 null comment '逻辑删除'
)
    comment '权限表' charset = utf8mb4;


drop table if exists user;
create table user
(
    id              int auto_increment primary key,
    username        varchar(63)             not null comment '用户名称',
    password        varchar(63)  default '' not null comment '用户密码',
    gender          tinyint(3)   default 0  not null comment '性别：0 未知， 1男， 1 女',
    birthday        date                    null comment '生日',
    last_login_time datetime                null comment '最近一次登录时间',
    last_login_ip   varchar(63)  default '' not null comment '最近一次登录IP地址',
    user_level      tinyint(3)   default 0  null comment '0 普通用户，1 VIP用户，2 高级VIP用户',
    nickname        varchar(63)  default '' not null comment '用户昵称或网络名称',
    mobile          varchar(20)  default '' not null comment '用户手机号码',
    avatar          varchar(255) default '' not null comment '用户头像图片',
    weixin_openid   varchar(63)  default '' not null comment '微信登录openid',
    session_key     varchar(100) default '' not null comment '微信登录会话KEY',
    status          tinyint(3)   default 0  not null comment '0 可用, 1 禁用, 2 注销',
    add_time        datetime                null comment '创建时间',
    update_time     datetime                null comment '更新时间',
    deleted         tinyint(1)   default 0  null comment '逻辑删除',
    constraint user_name
        unique (username)
)
    comment '用户表' charset = utf8mb4;

drop table if exists user_money;
create table user_money
(
    id          int auto_increment primary key,
    userId      int                         not null comment '用户id',
    money       decimal(10, 2) default 0.00 null comment '金额',
    add_time    datetime                    null comment '创建时间',
    update_time datetime                    null comment '更新时间'
)
    comment '用户钱包金额' charset = utf8mb4;

drop table if exists user_search_history;
create table user_search_history
(
    id          int auto_increment primary key,
    user_id     int                    not null comment '用户表的用户ID',
    keyword     varchar(63)            not null comment '搜索关键字',
    `from`      varchar(63) default '' not null comment '搜索来源，如pc、wx、app',
    add_time    datetime               null comment '创建时间',
    update_time datetime               null comment '更新时间',
    deleted     tinyint(1)  default 0  null comment '逻辑删除'
)
    comment '搜索历史表' charset = utf8mb4;

drop table if exists user_address;
create table user_address
(
    id             int auto_increment primary key,
    name           varchar(63)  default '' not null comment '收货人名称',
    user_id        int          default 0  not null comment '用户表的用户ID',
    province       varchar(63)             not null comment '行政区域表的省ID',
    city           varchar(63)             not null comment '行政区域表的市ID',
    county         varchar(63)             not null comment '行政区域表的区县ID',
    address_detail varchar(127) default '' not null comment '详细收货地址',
    area_code      char(6)                 null comment '地区编码',
    postal_code    char(6)                 null comment '邮政编码',
    tel            varchar(20)  default '' not null comment '手机号码',
    is_default     tinyint(1)   default 0  not null comment '是否默认地址',
    add_time       datetime                null comment '创建时间',
    update_time    datetime                null comment '更新时间',
    deleted        tinyint(1)   default 0  null comment '逻辑删除'
)
    comment '用户收货地址表' charset = utf8mb4;
create index user_id
    on user_address (user_id);

drop table if exists user_cart;
create table user_cart
(
    id               int auto_increment
        primary key,
    user_id          int                         null comment '用户表的用户ID',
    goods_id         int                         null comment '商品表的商品ID',
    goods_sn         varchar(63)                 null comment '商品编号',
    goods_name       varchar(127)                null comment '商品名称',
    price            decimal(10, 2) default 0.00 null comment '商品货品的价格',
    number           smallint(5)    default 0    null comment '商品货品的数量',
    specification_id int                         null comment '商品规格id',
    specifications   varchar(100)                null comment '商品规格',
    checked          tinyint(1)     default 1    null comment '购物车中商品是否选择状态',
    pic_url          varchar(255)                null comment '商品图片或者商品货品图片',
    add_time         datetime                    null comment '创建时间',
    update_time      datetime                    null comment '更新时间',
    deleted          tinyint(1)     default 0    null comment '逻辑删除'
)
    comment '用户购物车商品表' charset = utf8mb4;

drop table if exists user_collect;
create table user_collect
(
    id          int auto_increment primary key,
    user_id     int        default 0 not null comment '用户表的用户ID',
    goods_id    int        default 0 not null comment '商品ID',
    add_time    datetime             null comment '创建时间',
    update_time datetime             null comment '更新时间',
    deleted     tinyint(1) default 0 null comment '逻辑删除'
)
    comment '用户收藏表' charset = utf8mb4;
create index goods_id
    on user_collect (goods_id);
create index user_id
    on user_collect (user_id);

drop table if exists user_footprint;
create table user_footprint
(
    id          int auto_increment primary key,
    user_id     int        default 0 not null comment '用户表的用户ID',
    goods_id    int        default 0 not null comment '浏览商品ID',
    add_time    datetime             null comment '创建时间',
    update_time datetime             null comment '更新时间',
    deleted     tinyint(1) default 0 null comment '逻辑删除'
)
    comment '用户浏览足迹表' charset = utf8mb4;








