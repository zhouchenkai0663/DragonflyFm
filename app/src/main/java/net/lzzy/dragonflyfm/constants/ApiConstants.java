package net.lzzy.dragonflyfm.constants;


import net.lzzy.dragonflyfm.utils.AppUtils;

/**
 * Created by lzzy_gxy on 2019/4/15.
 * Description:
 */
public class ApiConstants {
    private static final String IP = AppUtils.loadServerSetting(AppUtils.getContext()).first;
    private static final String PORT = AppUtils.loadServerSetting(AppUtils.getContext()).second;
    private static final String PROTOCOL = "http://";
    /**
     * API地址
     */
    public static final String URL_API = PROTOCOL.concat(IP).concat(":").concat(PORT);
    /**
     * practices地址
     */
    public static final String ACTION_PRACTICES = "/api/practices";
    public static final String URL_PRACTICES = URL_API.concat(ACTION_PRACTICES);
    /**
     * question地址
     */
    public static final String ACTION_QUESTIONS = "/api/pquestions?practiceid=";
    public static final String URL_QUESTIONS = URL_API.concat(ACTION_QUESTIONS);


}
