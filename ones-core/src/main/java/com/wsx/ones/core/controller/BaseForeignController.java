package com.wsx.ones.core.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对于非session验证的接口
 * @author wangshuaixin
 *
 */
@RestController
@Scope("prototype")
public abstract class BaseForeignController {

}
