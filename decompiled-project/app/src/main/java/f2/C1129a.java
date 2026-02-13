package f2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import i2.AbstractC1310S;
import java.util.Iterator;
import q3.e;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1129a {

    /* renamed from: c, reason: collision with root package name */
    public static C1129a f16935c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f16936a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16937b;

    /* JADX WARN: Type inference failed for: r0v1, types: [f2.a, java.lang.Object] */
    public static C1129a a(Context context) {
        if (f16935c == null) {
            ?? obj = new Object();
            PackageManager packageManager = context.getPackageManager();
            Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(new Intent("android.support.v17.leanback.action.PARTNER_CUSTOMIZATION"), 0).iterator();
            e eVar = null;
            Resources resources = null;
            String str = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityInfo activityInfo = it.next().activityInfo;
                String str2 = activityInfo.packageName;
                if (str2 != null && (activityInfo.applicationInfo.flags & 1) != 0) {
                    try {
                        resources = packageManager.getResourcesForApplication(str2);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (resources != null) {
                    str = str2;
                    break;
                }
                str = str2;
            }
            if (resources != null) {
                eVar = new e(28);
                eVar.f23376b = resources;
                eVar.f23377c = str;
            }
            int i7 = AbstractC1310S.f18229a;
            obj.f16936a = false;
            if (eVar != null) {
                String str3 = (String) eVar.f23377c;
                Resources resources2 = (Resources) eVar.f23376b;
                int identifier = resources2.getIdentifier("leanback_prefer_static_shadows", "bool", str3);
                obj.f16936a = identifier > 0 ? resources2.getBoolean(identifier) : false;
            }
            boolean isLowRamDevice = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
            obj.f16937b = isLowRamDevice;
            if (eVar != null) {
                String str4 = (String) eVar.f23377c;
                Resources resources3 = (Resources) eVar.f23376b;
                int identifier2 = resources3.getIdentifier("leanback_outline_clipping_disabled", "bool", str4);
                if (identifier2 > 0) {
                    isLowRamDevice = resources3.getBoolean(identifier2);
                }
                obj.f16937b = isLowRamDevice;
            }
            f16935c = obj;
        }
        return f16935c;
    }
}
