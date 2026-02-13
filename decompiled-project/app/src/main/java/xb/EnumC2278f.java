package xb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xb.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2278f {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2278f f26324a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2278f[] f26325b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xb.f] */
    static {
        ?? r02 = new Enum("COMPLETE", 0);
        f26324a = r02;
        f26325b = new EnumC2278f[]{r02};
    }

    public static boolean a(Object obj, Bb.b bVar) {
        if (obj == f26324a) {
            bVar.a();
            return true;
        }
        if (obj instanceof C2277e) {
            bVar.onError(((C2277e) obj).f26323a);
            return true;
        }
        if (obj instanceof C2276d) {
            bVar.c(((C2276d) obj).f26322a);
            return false;
        }
        bVar.e(obj);
        return false;
    }

    public static EnumC2278f valueOf(String str) {
        return (EnumC2278f) Enum.valueOf(EnumC2278f.class, str);
    }

    public static EnumC2278f[] values() {
        return (EnumC2278f[]) f26325b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
