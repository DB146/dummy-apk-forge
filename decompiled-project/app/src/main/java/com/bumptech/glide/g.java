package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f14633a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f14634b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f14635c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f14636d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g[] f14637e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.bumptech.glide.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.bumptech.glide.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.bumptech.glide.g] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.bumptech.glide.g] */
    static {
        ?? r02 = new Enum("IMMEDIATE", 0);
        f14633a = r02;
        ?? r12 = new Enum("HIGH", 1);
        f14634b = r12;
        ?? r22 = new Enum("NORMAL", 2);
        f14635c = r22;
        ?? r32 = new Enum("LOW", 3);
        f14636d = r32;
        f14637e = new g[]{r02, r12, r22, r32};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f14637e.clone();
    }
}
