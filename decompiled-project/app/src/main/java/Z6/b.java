package Z6;

import android.text.TextUtils;
import c7.C0912a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f12198h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f12199a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12200b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12201c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f12202d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12203e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12204f;

    public b(String str, String str2, String str3, Date date, long j, long j10) {
        this.f12199a = str;
        this.f12200b = str2;
        this.f12201c = str3;
        this.f12202d = date;
        this.f12203e = j;
        this.f12204f = j10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, c7.a] */
    public final C0912a a() {
        ?? obj = new Object();
        obj.f14425a = "frc";
        obj.f14434m = this.f12202d.getTime();
        obj.f14426b = this.f12199a;
        obj.f14427c = this.f12200b;
        String str = this.f12201c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        obj.f14428d = str;
        obj.f14429e = this.f12203e;
        obj.j = this.f12204f;
        return obj;
    }
}
