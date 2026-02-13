package v7;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f25108a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f25109b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f25110c;

    /* JADX INFO: Fake field, exist only in values array */
    f EF10;

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Enum, java.lang.Object, v7.f] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Enum, java.lang.Object, v7.f] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Enum, java.lang.Object, v7.f] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Enum, java.lang.Object, v7.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v7.f] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, v7.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, v7.f] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, v7.f] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, v7.f] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Enum, v7.f] */
    static {
        ?? r10 = new Enum("X86_32", 0);
        ?? r12 = new Enum("X86_64", 1);
        ?? r22 = new Enum("ARM_UNKNOWN", 2);
        ?? r32 = new Enum("PPC", 3);
        ?? r42 = new Enum("PPC64", 4);
        ?? r122 = new Enum("ARMV6", 5);
        ?? r13 = new Enum("ARMV7", 6);
        ?? r72 = new Enum("UNKNOWN", 7);
        f25108a = r72;
        ?? r82 = new Enum("ARMV7S", 8);
        ?? r14 = new Enum("ARM64", 9);
        f25110c = new f[]{r10, r12, r22, r32, r42, r122, r13, r72, r82, r14};
        HashMap hashMap = new HashMap(4);
        f25109b = hashMap;
        hashMap.put("armeabi-v7a", r13);
        hashMap.put("armeabi", r122);
        hashMap.put("arm64-v8a", r14);
        hashMap.put("x86", r10);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f25110c.clone();
    }
}
