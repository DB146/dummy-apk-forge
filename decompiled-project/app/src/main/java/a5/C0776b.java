package a5;

import P4.Y;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import m4.InterfaceC1569g;
import n5.AbstractC1705a;
import n5.D;

/* renamed from: a5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776b implements InterfaceC1569g {

    /* renamed from: F, reason: collision with root package name */
    public static final C0776b f12708F = new C0776b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);

    /* renamed from: G, reason: collision with root package name */
    public static final String f12709G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f12710H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f12711I;

    /* renamed from: J, reason: collision with root package name */
    public static final String f12712J;

    /* renamed from: K, reason: collision with root package name */
    public static final String f12713K;
    public static final String L;

    /* renamed from: M, reason: collision with root package name */
    public static final String f12714M;

    /* renamed from: N, reason: collision with root package name */
    public static final String f12715N;

    /* renamed from: O, reason: collision with root package name */
    public static final String f12716O;

    /* renamed from: P, reason: collision with root package name */
    public static final String f12717P;

    /* renamed from: Q, reason: collision with root package name */
    public static final String f12718Q;

    /* renamed from: R, reason: collision with root package name */
    public static final String f12719R;

    /* renamed from: S, reason: collision with root package name */
    public static final String f12720S;

    /* renamed from: T, reason: collision with root package name */
    public static final String f12721T;

    /* renamed from: U, reason: collision with root package name */
    public static final String f12722U;

    /* renamed from: V, reason: collision with root package name */
    public static final String f12723V;

    /* renamed from: W, reason: collision with root package name */
    public static final String f12724W;

    /* renamed from: X, reason: collision with root package name */
    public static final Y f12725X;

    /* renamed from: A, reason: collision with root package name */
    public final int f12726A;

    /* renamed from: B, reason: collision with root package name */
    public final int f12727B;

    /* renamed from: C, reason: collision with root package name */
    public final float f12728C;

    /* renamed from: D, reason: collision with root package name */
    public final int f12729D;

    /* renamed from: E, reason: collision with root package name */
    public final float f12730E;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f12731a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f12732b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f12733c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f12734d;

    /* renamed from: e, reason: collision with root package name */
    public final float f12735e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12736f;

    /* renamed from: u, reason: collision with root package name */
    public final int f12737u;

    /* renamed from: v, reason: collision with root package name */
    public final float f12738v;

    /* renamed from: w, reason: collision with root package name */
    public final int f12739w;

    /* renamed from: x, reason: collision with root package name */
    public final float f12740x;

    /* renamed from: y, reason: collision with root package name */
    public final float f12741y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f12742z;

    static {
        int i7 = D.f21141a;
        f12709G = Integer.toString(0, 36);
        f12710H = Integer.toString(1, 36);
        f12711I = Integer.toString(2, 36);
        f12712J = Integer.toString(3, 36);
        f12713K = Integer.toString(4, 36);
        L = Integer.toString(5, 36);
        f12714M = Integer.toString(6, 36);
        f12715N = Integer.toString(7, 36);
        f12716O = Integer.toString(8, 36);
        f12717P = Integer.toString(9, 36);
        f12718Q = Integer.toString(10, 36);
        f12719R = Integer.toString(11, 36);
        f12720S = Integer.toString(12, 36);
        f12721T = Integer.toString(13, 36);
        f12722U = Integer.toString(14, 36);
        f12723V = Integer.toString(15, 36);
        f12724W = Integer.toString(16, 36);
        f12725X = new Y(24);
    }

    public C0776b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f4, int i7, int i10, float f10, int i11, int i12, float f11, float f12, float f13, boolean z8, int i13, int i14, float f14) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC1705a.h(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f12731a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f12731a = charSequence.toString();
        } else {
            this.f12731a = null;
        }
        this.f12732b = alignment;
        this.f12733c = alignment2;
        this.f12734d = bitmap;
        this.f12735e = f4;
        this.f12736f = i7;
        this.f12737u = i10;
        this.f12738v = f10;
        this.f12739w = i11;
        this.f12740x = f12;
        this.f12741y = f13;
        this.f12742z = z8;
        this.f12726A = i13;
        this.f12727B = i12;
        this.f12728C = f11;
        this.f12729D = i14;
        this.f12730E = f14;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a5.a] */
    public final C0775a a() {
        ?? obj = new Object();
        obj.f12694a = this.f12731a;
        obj.f12695b = this.f12734d;
        obj.f12696c = this.f12732b;
        obj.f12697d = this.f12733c;
        obj.f12698e = this.f12735e;
        obj.f12699f = this.f12736f;
        obj.g = this.f12737u;
        obj.f12700h = this.f12738v;
        obj.f12701i = this.f12739w;
        obj.j = this.f12727B;
        obj.k = this.f12728C;
        obj.f12702l = this.f12740x;
        obj.f12703m = this.f12741y;
        obj.f12704n = this.f12742z;
        obj.f12705o = this.f12726A;
        obj.f12706p = this.f12729D;
        obj.f12707q = this.f12730E;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0776b.class != obj.getClass()) {
            return false;
        }
        C0776b c0776b = (C0776b) obj;
        if (TextUtils.equals(this.f12731a, c0776b.f12731a) && this.f12732b == c0776b.f12732b && this.f12733c == c0776b.f12733c) {
            Bitmap bitmap = c0776b.f12734d;
            Bitmap bitmap2 = this.f12734d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f12735e == c0776b.f12735e && this.f12736f == c0776b.f12736f && this.f12737u == c0776b.f12737u && this.f12738v == c0776b.f12738v && this.f12739w == c0776b.f12739w && this.f12740x == c0776b.f12740x && this.f12741y == c0776b.f12741y && this.f12742z == c0776b.f12742z && this.f12726A == c0776b.f12726A && this.f12727B == c0776b.f12727B && this.f12728C == c0776b.f12728C && this.f12729D == c0776b.f12729D && this.f12730E == c0776b.f12730E) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12731a, this.f12732b, this.f12733c, this.f12734d, Float.valueOf(this.f12735e), Integer.valueOf(this.f12736f), Integer.valueOf(this.f12737u), Float.valueOf(this.f12738v), Integer.valueOf(this.f12739w), Float.valueOf(this.f12740x), Float.valueOf(this.f12741y), Boolean.valueOf(this.f12742z), Integer.valueOf(this.f12726A), Integer.valueOf(this.f12727B), Float.valueOf(this.f12728C), Integer.valueOf(this.f12729D), Float.valueOf(this.f12730E)});
    }
}
