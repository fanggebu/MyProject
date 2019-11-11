package cn.main;

import org.nutz.mvc.annotation.*;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

/**
 * @author kangjian
 * @date 2019/8/27
 * @description
 */
@Modules(scanPackage = true, packages = "cn.modules")
@Ok("json:full")
@Fail("http:500")
@IocBy(type = ComboIocProvider.class, args = {"*json","ioc/", "*anno", "cn.modules"})
@Localization(value = "locales/", defaultLocalizationKey = "zh_CN")
@Encoding(input = "UTF-8", output = "UTF-8")
public class Module {
}
