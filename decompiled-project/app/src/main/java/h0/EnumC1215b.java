package h0;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1215b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1215b f17591a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1215b f17592b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1215b f17593c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1215b[] f17594d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h0.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h0.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, h0.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, h0.b] */
    static {
        ?? r02 = new Enum("None", 0);
        f17591a = r02;
        ?? r12 = new Enum("Cancelled", 1);
        f17592b = r12;
        ?? r22 = new Enum("Redirected", 2);
        f17593c = r22;
        EnumC1215b[] enumC1215bArr = {r02, r12, r22, new Enum("RedirectCancelled", 3)};
        f17594d = enumC1215bArr;
        x.k(enumC1215bArr);
    }

    public static EnumC1215b valueOf(String str) {
        return (EnumC1215b) Enum.valueOf(EnumC1215b.class, str);
    }

    public static EnumC1215b[] values() {
        return (EnumC1215b[]) f17594d.clone();
    }
}
