package net.lzzy.dragonflyfm.constants;


import net.lzzy.dragonflyfm.R;
import net.lzzy.dragonflyfm.utils.AppUtils;
import net.lzzy.sqllib.DbPackager;

/**
 * @author lzzy_gxy
 * @date 2019/3/11
 * Description:
 */
public final class DbConstants {
    private DbConstants(){}
    private static final String DB_NAME = "dragonfly.db";
    private static final int DB_VERSION = 1;
    public static DbPackager packager;
    static {
        packager = DbPackager.getInstance(AppUtils.getContext(),DB_NAME,DB_VERSION, R.raw.models);
    }
}
