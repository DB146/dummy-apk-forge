package f5;

import P1.g;
import android.graphics.Color;
import h3.H;
import n5.AbstractC1705a;

/* renamed from: f5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1138d {

    /* renamed from: a, reason: collision with root package name */
    public final String f16958a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16959b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f16960c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f16961d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16962e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16963f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16964h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16965i;
    public final int j;

    public C1138d(String str, int i7, Integer num, Integer num2, float f4, boolean z8, boolean z10, boolean z11, boolean z12, int i10) {
        this.f16958a = str;
        this.f16959b = i7;
        this.f16960c = num;
        this.f16961d = num2;
        this.f16962e = f4;
        this.f16963f = z8;
        this.g = z10;
        this.f16964h = z11;
        this.f16965i = z12;
        this.j = i10;
    }

    public static int a(String str) {
        boolean z8;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case g.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                    z8 = true;
                    break;
                default:
                    z8 = false;
                    break;
            }
            if (z8) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        A3.c.q("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e2) {
            AbstractC1705a.R(e2, "SsaStyle", "Failed to parse boolean value: '" + str + "'");
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC1705a.h(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(H.f(((parseLong >> 24) & 255) ^ 255), H.f(parseLong & 255), H.f((parseLong >> 8) & 255), H.f((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            AbstractC1705a.R(e2, "SsaStyle", "Failed to parse color expression: '" + str + "'");
            return null;
        }
    }
}
