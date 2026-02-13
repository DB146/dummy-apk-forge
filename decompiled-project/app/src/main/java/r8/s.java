package r8;

import A9.O0;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f23873c;

    /* renamed from: a, reason: collision with root package name */
    public O0 f23874a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f23875b;

    public s(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f23875b = scheduledThreadPoolExecutor;
    }

    public final synchronized r a() {
        String str;
        r rVar;
        O0 o02 = this.f23874a;
        synchronized (((ArrayDeque) o02.f925d)) {
            str = (String) ((ArrayDeque) o02.f925d).peek();
        }
        Pattern pattern = r.f23869d;
        rVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                rVar = new r(split[0], split[1]);
            }
        }
        return rVar;
    }
}
