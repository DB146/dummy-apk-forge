package l2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {
    private static final /* synthetic */ Kb.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final C1472p Companion;
    public static final r ON_ANY;
    public static final r ON_CREATE;
    public static final r ON_DESTROY;
    public static final r ON_PAUSE;
    public static final r ON_RESUME;
    public static final r ON_START;
    public static final r ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l2.r] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l2.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l2.r] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l2.r] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, l2.r] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, l2.r] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, l2.r] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, l2.r] */
    static {
        ?? r02 = new Enum("ON_CREATE", 0);
        ON_CREATE = r02;
        ?? r12 = new Enum("ON_START", 1);
        ON_START = r12;
        ?? r22 = new Enum("ON_RESUME", 2);
        ON_RESUME = r22;
        ?? r32 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r32;
        ?? r42 = new Enum("ON_STOP", 4);
        ON_STOP = r42;
        ?? r52 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r52;
        ?? r62 = new Enum("ON_ANY", 6);
        ON_ANY = r62;
        r[] rVarArr = {r02, r12, r22, r32, r42, r52, r62};
        $VALUES = rVarArr;
        $ENTRIES = Z9.x.k(rVarArr);
        Companion = new Object();
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final EnumC1474s a() {
        switch (AbstractC1473q.f19226a[ordinal()]) {
            case 1:
            case 2:
                return EnumC1474s.f19229c;
            case 3:
            case 4:
                return EnumC1474s.f19230d;
            case 5:
                return EnumC1474s.f19231e;
            case 6:
                return EnumC1474s.f19227a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new Db.d(1);
        }
    }
}
