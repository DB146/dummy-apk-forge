package M9;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f6846a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f6847b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f6848c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f6849d;

    /* JADX WARN: Type inference failed for: r0v0, types: [M9.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [M9.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [M9.c, java.lang.Enum] */
    static {
        ?? r02 = new Enum("TV_CHANNEL", 0);
        f6846a = r02;
        ?? r12 = new Enum("FOOTBALL", 1);
        f6847b = r12;
        ?? r22 = new Enum("MOVIE", 2);
        f6848c = r22;
        c[] cVarArr = {r02, r12, r22};
        f6849d = cVarArr;
        x.k(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f6849d.clone();
    }
}
