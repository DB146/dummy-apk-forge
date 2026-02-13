package a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0773x {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0773x f12690a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0773x[] f12691b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0773x EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [a4.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a4.x, java.lang.Enum] */
    static {
        ?? r02 = new Enum("UNKNOWN", 0);
        ?? r12 = new Enum("ANDROID_FIREBASE", 1);
        f12690a = r12;
        f12691b = new EnumC0773x[]{r02, r12};
    }

    public static EnumC0773x valueOf(String str) {
        return (EnumC0773x) Enum.valueOf(EnumC0773x.class, str);
    }

    public static EnumC0773x[] values() {
        return (EnumC0773x[]) f12691b.clone();
    }
}
