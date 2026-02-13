package P8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f8208a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f8209b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f8210c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f8211d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f8212e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f8213f;

    /* renamed from: u, reason: collision with root package name */
    public static final e f8214u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ e[] f8215v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, P8.e] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, P8.e] */
    static {
        ?? r02 = new Enum("ERROR_CORRECTION", 0);
        f8208a = r02;
        ?? r12 = new Enum("CHARACTER_SET", 1);
        f8209b = r12;
        ?? r22 = new Enum("DATA_MATRIX_SHAPE", 2);
        ?? r32 = new Enum("DATA_MATRIX_COMPACT", 3);
        ?? r42 = new Enum("MIN_SIZE", 4);
        ?? r52 = new Enum("MAX_SIZE", 5);
        ?? r62 = new Enum("MARGIN", 6);
        f8210c = r62;
        ?? r72 = new Enum("PDF417_COMPACT", 7);
        ?? r82 = new Enum("PDF417_COMPACTION", 8);
        ?? r92 = new Enum("PDF417_DIMENSIONS", 9);
        ?? r10 = new Enum("PDF417_AUTO_ECI", 10);
        ?? r11 = new Enum("AZTEC_LAYERS", 11);
        ?? r122 = new Enum("QR_VERSION", 12);
        f8211d = r122;
        ?? r13 = new Enum("QR_MASK_PATTERN", 13);
        f8212e = r13;
        ?? r14 = new Enum("QR_COMPACT", 14);
        f8213f = r14;
        ?? r15 = new Enum("GS1_FORMAT", 15);
        f8214u = r15;
        f8215v = new e[]{r02, r12, r22, r32, r42, r52, r62, r72, r82, r92, r10, r11, r122, r13, r14, r15, new Enum("FORCE_CODE_SET", 16), new Enum("FORCE_C40", 17), new Enum("CODE128_COMPACT", 18)};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f8215v.clone();
    }
}
