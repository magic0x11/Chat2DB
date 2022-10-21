package com.alibaba.dataops.server.web.api.controller.redis;

import com.alibaba.dataops.server.tools.base.wrapper.result.ActionResult;
import com.alibaba.dataops.server.tools.base.wrapper.result.ListResult;
import com.alibaba.dataops.server.web.api.aspect.BusinessExceptionAspect;
import com.alibaba.dataops.server.web.api.controller.redis.request.KeyCreateRequest;
import com.alibaba.dataops.server.web.api.controller.redis.request.KeyDeleteRequest;
import com.alibaba.dataops.server.web.api.controller.redis.request.KeyQueryRequest;
import com.alibaba.dataops.server.web.api.controller.redis.request.KeyUpdateRequest;
import com.alibaba.dataops.server.web.api.controller.redis.vo.KeyVO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * redis key运维类
 *
 * @author moji
 * @version MysqlTableManageController.java, v 0.1 2022年09月16日 17:41 moji Exp $
 * @date 2022/09/16
 */
@BusinessExceptionAspect
@RequestMapping("/api/redis/key")
@RestController
public class RedisKeyManageController {

    /**
     * 查询当前DB下的key列表
     *
     * @param request
     * @return
     */
    @GetMapping("/list")
    public ListResult<KeyVO> list(KeyQueryRequest request) {
        return null;
    }

    /**
     * 新增Key
     *
     * @param request
     * @return
     */
    @PostMapping("/create")
    public ActionResult create(@RequestBody KeyCreateRequest request) {
        return null;
    }

    /**
     * 修改key信息
     *
     * @param request
     * @return
     */
    @PutMapping("/update")
    public ActionResult update(@RequestBody KeyUpdateRequest request) {
        return null;
    }


    /**
     * 删除key
     *
     * @param request
     * @return
     */
    @DeleteMapping("/delete")
    public ActionResult delete(@RequestBody KeyDeleteRequest request) {
        return null;
    }
}
