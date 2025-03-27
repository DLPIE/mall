package com.mall.member.feign;

import com.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon") // 1.目标服务
public interface CouponFeignService {
    // 2.目标方法（从被调用服务中粘贴过来即可）注意路径：mall-coupon/coupon/coupon/member/list
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
