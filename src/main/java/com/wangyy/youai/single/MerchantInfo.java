package com.wangyy.youai.single;

/**
 * Created by qingjiang on 2017/6/23.
 */
public class MerchantInfo {
    //
    private static int merchantUid = 100005;
    private static String merchantName = "SSY";
    private static String merchantDesc = "sui shen yun";

    private MerchantInfo(){}

    public MerchantInfo(int merchantUid, String merchantName, String merchantDesc) {
        this.merchantUid = merchantUid;
        this.merchantName = merchantName;
        this.merchantDesc = merchantDesc;
    }

    private static MerchantInfo merchantInfo = new MerchantInfo(merchantUid, merchantName, merchantDesc);

    //饿汉式
    public static MerchantInfo getInstance() {
        return merchantInfo;
    }

}
