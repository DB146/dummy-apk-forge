package wb;

import com.bumptech.glide.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c implements Ac.b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f25857a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c[] f25858b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wb.c] */
    static {
        ?? r02 = new Enum("CANCELLED", 0);
        f25857a = r02;
        f25858b = new c[]{r02};
    }

    public static boolean a(long j) {
        if (j > 0) {
            return true;
        }
        d.t(new IllegalArgumentException(A3.c.h("n > 0 required but it was ", j)));
        return false;
    }

    public static boolean b(Ac.b bVar, Ac.b bVar2) {
        if (bVar == null) {
            return true;
        }
        bVar2.cancel();
        d.t(new IllegalStateException("Subscription already set!"));
        return false;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f25858b.clone();
    }

    @Override // Ac.b
    public final void cancel() {
    }

    @Override // Ac.b
    public final void d(long j) {
    }
}
