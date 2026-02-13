package com.kt.apps.core.update;

import G8.m;
import Hb.d;
import Ib.a;
import a.AbstractC0672a;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import cc.F;
import cc.I;
import cc.P;
import com.kt.apps.core.update.downloadmanager.ApkDownloadTask;
import com.kt.apps.core.update.downloadmanager.ApkDownloader;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import u8.c;

/* loaded from: classes2.dex */
public class AppUpdateRepository {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_LAST_CONFIG = "extra:key_last_update_config";
    public static final String KEY_LAST_LOAD_CONFIG = "extra:key_last_load_update_config";
    private static final String SHARED_PREF_NAME = "update_config";
    private static AppUpdateRepository _instance;
    private final c configLoader;
    private final Context context;
    private final m gson;
    private boolean isLoading;
    private UpdateDTO lastUpdateConfig;
    private I loadConfigDeferred;
    private final SharedPreferences sharedPref;
    private final String updateConfigKey;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final AppUpdateRepository getInstance(Application context) {
            l.e(context, "context");
            AppUpdateRepository appUpdateRepository = AppUpdateRepository._instance;
            if (appUpdateRepository != null) {
                return appUpdateRepository;
            }
            m mVar = new m();
            SharedPreferences sharedPreferences = context.getSharedPreferences(AppUpdateRepository.SHARED_PREF_NAME, 0);
            l.d(sharedPreferences, "getSharedPreferences(...)");
            AppUpdateRepository appUpdateRepository2 = new AppUpdateRepository(context, mVar, sharedPreferences, AbstractC0672a.i(), TSConstants.KEY_UPDATE_CONFIG);
            AppUpdateRepository._instance = appUpdateRepository2;
            return appUpdateRepository2;
        }
    }

    public AppUpdateRepository(Context context, m gson, SharedPreferences sharedPref, c configLoader, String updateConfigKey) {
        l.e(context, "context");
        l.e(gson, "gson");
        l.e(sharedPref, "sharedPref");
        l.e(configLoader, "configLoader");
        l.e(updateConfigKey, "updateConfigKey");
        this.context = context;
        this.gson = gson;
        this.sharedPref = sharedPref;
        this.configLoader = configLoader;
        this.updateConfigKey = updateConfigKey;
    }

    public /* synthetic */ AppUpdateRepository(Context context, m mVar, SharedPreferences sharedPreferences, c cVar, String str, int i7, f fVar) {
        this(context, mVar, sharedPreferences, (i7 & 8) != 0 ? AbstractC0672a.i() : cVar, str);
    }

    public final void clearRef() {
        this.lastUpdateConfig = null;
    }

    public final c getConfigLoader() {
        return this.configLoader;
    }

    public final Context getContext() {
        return this.context;
    }

    public final m getGson() {
        return this.gson;
    }

    public final UpdateDTO getLastUpdateConfig() {
        return this.lastUpdateConfig;
    }

    public final SharedPreferences getSharedPref() {
        return this.sharedPref;
    }

    public final String getUpdateConfigKey() {
        return this.updateConfigKey;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final Object loadUpdateConfig(boolean z8, d<? super UpdateDTO> dVar) {
        return F.K(P.f14500c, new AppUpdateRepository$loadUpdateConfig$2(this, z8, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object needUpdate(d<? super Boolean> dVar) {
        AppUpdateRepository$needUpdate$1 appUpdateRepository$needUpdate$1;
        int i7;
        long j;
        UpdateDTO updateDTO;
        if (dVar instanceof AppUpdateRepository$needUpdate$1) {
            appUpdateRepository$needUpdate$1 = (AppUpdateRepository$needUpdate$1) dVar;
            int i10 = appUpdateRepository$needUpdate$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                appUpdateRepository$needUpdate$1.label = i10 - Integer.MIN_VALUE;
                Object obj = appUpdateRepository$needUpdate$1.result;
                Object obj2 = a.f5345a;
                i7 = appUpdateRepository$needUpdate$1.label;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    long longVersionCode = Build.VERSION.SDK_INT >= 28 ? this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).getLongVersionCode() : r8.versionCode;
                    appUpdateRepository$needUpdate$1.J$0 = longVersionCode;
                    appUpdateRepository$needUpdate$1.label = 1;
                    obj = loadUpdateConfig(false, appUpdateRepository$needUpdate$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    j = longVersionCode;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = appUpdateRepository$needUpdate$1.J$0;
                    com.bumptech.glide.c.c0(obj);
                }
                updateDTO = (UpdateDTO) obj;
                if (updateDTO != null) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(j < updateDTO.getNewestVersion());
            }
        }
        appUpdateRepository$needUpdate$1 = new AppUpdateRepository$needUpdate$1(this, dVar);
        Object obj3 = appUpdateRepository$needUpdate$1.result;
        Object obj22 = a.f5345a;
        i7 = appUpdateRepository$needUpdate$1.label;
        if (i7 != 0) {
        }
        updateDTO = (UpdateDTO) obj3;
        if (updateDTO != null) {
        }
    }

    public final Object startDownload(d<? super ApkDownloadTask> dVar) {
        String updateUrl;
        UpdateDTO updateDTO = this.lastUpdateConfig;
        if (updateDTO == null || (updateUrl = updateDTO.getUpdateUrl()) == null) {
            return null;
        }
        return new ApkDownloader(this.context).startDownload(updateUrl);
    }
}
