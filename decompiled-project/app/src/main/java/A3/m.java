package A3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f361a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ m[] f362b;

    /* JADX INFO: Fake field, exist only in values array */
    m EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, A3.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, A3.m] */
    static {
        ?? r02 = new Enum("SRGB", 0);
        ?? r12 = new Enum("DISPLAY_P3", 1);
        f361a = r12;
        f362b = new m[]{r02, r12};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f362b.clone();
    }
}
