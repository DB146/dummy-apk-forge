package I2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public static final L f5057a;

    /* renamed from: b, reason: collision with root package name */
    public static final L f5058b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ L[] f5059c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, I2.L] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, I2.L] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, I2.L] */
    static {
        ?? r02 = new Enum("DEFERRED", 0);
        f5057a = r02;
        ?? r12 = new Enum("IMMEDIATE", 1);
        f5058b = r12;
        L[] lArr = {r02, r12, new Enum("EXCLUSIVE", 2)};
        f5059c = lArr;
        Z9.x.k(lArr);
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f5059c.clone();
    }
}
