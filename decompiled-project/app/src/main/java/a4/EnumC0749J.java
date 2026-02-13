package a4;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a4.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0749J {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0749J f12612a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0749J[] f12613b;

    /* JADX WARN: Type inference failed for: r10v0, types: [a4.J, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [a4.J, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [a4.J, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a4.J, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a4.J, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [a4.J, java.lang.Enum, java.lang.Object] */
    static {
        ?? r62 = new Enum("DEFAULT", 0);
        f12612a = r62;
        ?? r82 = new Enum("UNMETERED_ONLY", 1);
        ?? r10 = new Enum("UNMETERED_OR_DAILY", 2);
        ?? r12 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        ?? r14 = new Enum("NEVER", 4);
        ?? r52 = new Enum("UNRECOGNIZED", 5);
        f12613b = new EnumC0749J[]{r62, r82, r10, r12, r14, r52};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r62);
        sparseArray.put(1, r82);
        sparseArray.put(2, r10);
        sparseArray.put(3, r12);
        sparseArray.put(4, r14);
        sparseArray.put(-1, r52);
    }

    public static EnumC0749J valueOf(String str) {
        return (EnumC0749J) Enum.valueOf(EnumC0749J.class, str);
    }

    public static EnumC0749J[] values() {
        return (EnumC0749J[]) f12613b.clone();
    }
}
