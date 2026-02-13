package M8;

import M8.a;
import M8.b;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f6839a;

    /* renamed from: b, reason: collision with root package name */
    public static final a.C0000a f6840b;

    /* renamed from: c, reason: collision with root package name */
    public static final b.a f6841c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f6842d;

    static {
        boolean z8;
        try {
            Class.forName("java.sql.Date");
            z8 = true;
        } catch (ClassNotFoundException unused) {
            z8 = false;
        }
        f6839a = z8;
        if (!z8) {
            f6840b = null;
            f6841c = null;
            f6842d = null;
        } else {
            new e(0, Date.class);
            new e(1, Timestamp.class);
            f6840b = a.f6832b;
            f6841c = b.f6834b;
            f6842d = d.f6836b;
        }
    }
}
