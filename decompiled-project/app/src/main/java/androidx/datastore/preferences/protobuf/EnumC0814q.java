package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0814q {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0814q f13442b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0814q f13443c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0814q[] f13444d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0814q[] f13445e;

    /* renamed from: a, reason: collision with root package name */
    public final int f13446a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0814q EF0;

    static {
        EnumC0822z enumC0822z = EnumC0822z.DOUBLE;
        EnumC0814q enumC0814q = new EnumC0814q("DOUBLE", 0, 0, 1, enumC0822z);
        EnumC0822z enumC0822z2 = EnumC0822z.FLOAT;
        EnumC0814q enumC0814q2 = new EnumC0814q("FLOAT", 1, 1, 1, enumC0822z2);
        EnumC0822z enumC0822z3 = EnumC0822z.LONG;
        EnumC0814q enumC0814q3 = new EnumC0814q("INT64", 2, 2, 1, enumC0822z3);
        EnumC0814q enumC0814q4 = new EnumC0814q("UINT64", 3, 3, 1, enumC0822z3);
        EnumC0822z enumC0822z4 = EnumC0822z.INT;
        EnumC0814q enumC0814q5 = new EnumC0814q("INT32", 4, 4, 1, enumC0822z4);
        EnumC0814q enumC0814q6 = new EnumC0814q("FIXED64", 5, 5, 1, enumC0822z3);
        EnumC0814q enumC0814q7 = new EnumC0814q("FIXED32", 6, 6, 1, enumC0822z4);
        EnumC0822z enumC0822z5 = EnumC0822z.BOOLEAN;
        EnumC0814q enumC0814q8 = new EnumC0814q("BOOL", 7, 7, 1, enumC0822z5);
        EnumC0822z enumC0822z6 = EnumC0822z.STRING;
        EnumC0814q enumC0814q9 = new EnumC0814q("STRING", 8, 8, 1, enumC0822z6);
        EnumC0822z enumC0822z7 = EnumC0822z.MESSAGE;
        EnumC0814q enumC0814q10 = new EnumC0814q("MESSAGE", 9, 9, 1, enumC0822z7);
        EnumC0822z enumC0822z8 = EnumC0822z.BYTE_STRING;
        EnumC0814q enumC0814q11 = new EnumC0814q("BYTES", 10, 10, 1, enumC0822z8);
        EnumC0814q enumC0814q12 = new EnumC0814q("UINT32", 11, 11, 1, enumC0822z4);
        EnumC0822z enumC0822z9 = EnumC0822z.ENUM;
        EnumC0814q enumC0814q13 = new EnumC0814q("ENUM", 12, 12, 1, enumC0822z9);
        EnumC0814q enumC0814q14 = new EnumC0814q("SFIXED32", 13, 13, 1, enumC0822z4);
        EnumC0814q enumC0814q15 = new EnumC0814q("SFIXED64", 14, 14, 1, enumC0822z3);
        EnumC0814q enumC0814q16 = new EnumC0814q("SINT32", 15, 15, 1, enumC0822z4);
        EnumC0814q enumC0814q17 = new EnumC0814q("SINT64", 16, 16, 1, enumC0822z3);
        EnumC0814q enumC0814q18 = new EnumC0814q("GROUP", 17, 17, 1, enumC0822z7);
        EnumC0814q enumC0814q19 = new EnumC0814q("DOUBLE_LIST", 18, 18, 2, enumC0822z);
        EnumC0814q enumC0814q20 = new EnumC0814q("FLOAT_LIST", 19, 19, 2, enumC0822z2);
        EnumC0814q enumC0814q21 = new EnumC0814q("INT64_LIST", 20, 20, 2, enumC0822z3);
        EnumC0814q enumC0814q22 = new EnumC0814q("UINT64_LIST", 21, 21, 2, enumC0822z3);
        EnumC0814q enumC0814q23 = new EnumC0814q("INT32_LIST", 22, 22, 2, enumC0822z4);
        EnumC0814q enumC0814q24 = new EnumC0814q("FIXED64_LIST", 23, 23, 2, enumC0822z3);
        EnumC0814q enumC0814q25 = new EnumC0814q("FIXED32_LIST", 24, 24, 2, enumC0822z4);
        EnumC0814q enumC0814q26 = new EnumC0814q("BOOL_LIST", 25, 25, 2, enumC0822z5);
        EnumC0814q enumC0814q27 = new EnumC0814q("STRING_LIST", 26, 26, 2, enumC0822z6);
        EnumC0814q enumC0814q28 = new EnumC0814q("MESSAGE_LIST", 27, 27, 2, enumC0822z7);
        EnumC0814q enumC0814q29 = new EnumC0814q("BYTES_LIST", 28, 28, 2, enumC0822z8);
        EnumC0814q enumC0814q30 = new EnumC0814q("UINT32_LIST", 29, 29, 2, enumC0822z4);
        EnumC0814q enumC0814q31 = new EnumC0814q("ENUM_LIST", 30, 30, 2, enumC0822z9);
        EnumC0814q enumC0814q32 = new EnumC0814q("SFIXED32_LIST", 31, 31, 2, enumC0822z4);
        EnumC0814q enumC0814q33 = new EnumC0814q("SFIXED64_LIST", 32, 32, 2, enumC0822z3);
        EnumC0814q enumC0814q34 = new EnumC0814q("SINT32_LIST", 33, 33, 2, enumC0822z4);
        EnumC0814q enumC0814q35 = new EnumC0814q("SINT64_LIST", 34, 34, 2, enumC0822z3);
        EnumC0814q enumC0814q36 = new EnumC0814q("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0822z);
        f13442b = enumC0814q36;
        EnumC0814q enumC0814q37 = new EnumC0814q("FLOAT_LIST_PACKED", 36, 36, 3, enumC0822z2);
        EnumC0814q enumC0814q38 = new EnumC0814q("INT64_LIST_PACKED", 37, 37, 3, enumC0822z3);
        EnumC0814q enumC0814q39 = new EnumC0814q("UINT64_LIST_PACKED", 38, 38, 3, enumC0822z3);
        EnumC0814q enumC0814q40 = new EnumC0814q("INT32_LIST_PACKED", 39, 39, 3, enumC0822z4);
        EnumC0814q enumC0814q41 = new EnumC0814q("FIXED64_LIST_PACKED", 40, 40, 3, enumC0822z3);
        EnumC0814q enumC0814q42 = new EnumC0814q("FIXED32_LIST_PACKED", 41, 41, 3, enumC0822z4);
        EnumC0814q enumC0814q43 = new EnumC0814q("BOOL_LIST_PACKED", 42, 42, 3, enumC0822z5);
        EnumC0814q enumC0814q44 = new EnumC0814q("UINT32_LIST_PACKED", 43, 43, 3, enumC0822z4);
        EnumC0814q enumC0814q45 = new EnumC0814q("ENUM_LIST_PACKED", 44, 44, 3, enumC0822z9);
        EnumC0814q enumC0814q46 = new EnumC0814q("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0822z4);
        EnumC0814q enumC0814q47 = new EnumC0814q("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0822z3);
        EnumC0814q enumC0814q48 = new EnumC0814q("SINT32_LIST_PACKED", 47, 47, 3, enumC0822z4);
        EnumC0814q enumC0814q49 = new EnumC0814q("SINT64_LIST_PACKED", 48, 48, 3, enumC0822z3);
        f13443c = enumC0814q49;
        f13445e = new EnumC0814q[]{enumC0814q, enumC0814q2, enumC0814q3, enumC0814q4, enumC0814q5, enumC0814q6, enumC0814q7, enumC0814q8, enumC0814q9, enumC0814q10, enumC0814q11, enumC0814q12, enumC0814q13, enumC0814q14, enumC0814q15, enumC0814q16, enumC0814q17, enumC0814q18, enumC0814q19, enumC0814q20, enumC0814q21, enumC0814q22, enumC0814q23, enumC0814q24, enumC0814q25, enumC0814q26, enumC0814q27, enumC0814q28, enumC0814q29, enumC0814q30, enumC0814q31, enumC0814q32, enumC0814q33, enumC0814q34, enumC0814q35, enumC0814q36, enumC0814q37, enumC0814q38, enumC0814q39, enumC0814q40, enumC0814q41, enumC0814q42, enumC0814q43, enumC0814q44, enumC0814q45, enumC0814q46, enumC0814q47, enumC0814q48, enumC0814q49, new EnumC0814q("GROUP_LIST", 49, 49, 2, enumC0822z7), new EnumC0814q("MAP", 50, 50, 4, EnumC0822z.VOID)};
        EnumC0814q[] values = values();
        f13444d = new EnumC0814q[values.length];
        for (EnumC0814q enumC0814q50 : values) {
            f13444d[enumC0814q50.f13446a] = enumC0814q50;
        }
    }

    public EnumC0814q(String str, int i7, int i10, int i11, EnumC0822z enumC0822z) {
        this.f13446a = i10;
        int b2 = P.c.b(i11);
        if (b2 == 1) {
            enumC0822z.getClass();
        } else if (b2 == 3) {
            enumC0822z.getClass();
        }
        if (i11 == 1) {
            enumC0822z.ordinal();
        }
    }

    public static EnumC0814q valueOf(String str) {
        return (EnumC0814q) Enum.valueOf(EnumC0814q.class, str);
    }

    public static EnumC0814q[] values() {
        return (EnumC0814q[]) f13445e.clone();
    }

    public final int a() {
        return this.f13446a;
    }
}
