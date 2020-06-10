package com.fei.admin.web;

import com.fei.admin.annotation.RequiresPermissionsDesc;
import com.fei.common_until.ResponseUtil;
import com.google.common.collect.Lists;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/userProperty")
@Validated
public class AdminUserPropertyController {
    private final Log logger = LogFactory.getLog(AdminUserPropertyController.class);

//    @Autowired
//    private LitemallUserPropertyService userPropertyService;


    @RequiresPermissions("admin:score")
    @RequiresPermissionsDesc(menu = {"推广管理", "积分管理"}, button = "规则查询")
    @GetMapping("/listRule")
    public Object listRule(Integer ruleType,
                           @RequestParam(defaultValue = "1") Integer page,
                           @RequestParam(defaultValue = "10") Integer limit) {
//        List<LitemallScoreRule> litemallScoreRules;
//        litemallScoreRules = userPropertyService.queryRuleSelective(ruleType, page, limit, sort, order);
        return ResponseUtil.okList(Lists.newArrayList());
    }


}
