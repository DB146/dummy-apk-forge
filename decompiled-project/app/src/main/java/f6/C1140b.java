package f6;

import a6.C0779c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: f6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1140b implements Parcelable {
    public static final Parcelable.Creator<C1140b> CREATOR = new C0779c(25);

    /* renamed from: B, reason: collision with root package name */
    public Locale f16980B;

    /* renamed from: C, reason: collision with root package name */
    public String f16981C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f16982D;

    /* renamed from: E, reason: collision with root package name */
    public int f16983E;

    /* renamed from: F, reason: collision with root package name */
    public int f16984F;

    /* renamed from: G, reason: collision with root package name */
    public Integer f16985G;

    /* renamed from: I, reason: collision with root package name */
    public Integer f16987I;

    /* renamed from: J, reason: collision with root package name */
    public Integer f16988J;

    /* renamed from: K, reason: collision with root package name */
    public Integer f16989K;
    public Integer L;

    /* renamed from: M, reason: collision with root package name */
    public Integer f16990M;

    /* renamed from: N, reason: collision with root package name */
    public Integer f16991N;

    /* renamed from: O, reason: collision with root package name */
    public Integer f16992O;

    /* renamed from: P, reason: collision with root package name */
    public Integer f16993P;

    /* renamed from: Q, reason: collision with root package name */
    public Integer f16994Q;

    /* renamed from: R, reason: collision with root package name */
    public Boolean f16995R;

    /* renamed from: a, reason: collision with root package name */
    public int f16996a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f16997b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f16998c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f16999d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f17000e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f17001f;

    /* renamed from: u, reason: collision with root package name */
    public Integer f17002u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f17003v;

    /* renamed from: x, reason: collision with root package name */
    public String f17005x;

    /* renamed from: w, reason: collision with root package name */
    public int f17004w = 255;

    /* renamed from: y, reason: collision with root package name */
    public int f17006y = -2;

    /* renamed from: z, reason: collision with root package name */
    public int f17007z = -2;

    /* renamed from: A, reason: collision with root package name */
    public int f16979A = -2;

    /* renamed from: H, reason: collision with root package name */
    public Boolean f16986H = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f16996a);
        parcel.writeSerializable(this.f16997b);
        parcel.writeSerializable(this.f16998c);
        parcel.writeSerializable(this.f16999d);
        parcel.writeSerializable(this.f17000e);
        parcel.writeSerializable(this.f17001f);
        parcel.writeSerializable(this.f17002u);
        parcel.writeSerializable(this.f17003v);
        parcel.writeInt(this.f17004w);
        parcel.writeString(this.f17005x);
        parcel.writeInt(this.f17006y);
        parcel.writeInt(this.f17007z);
        parcel.writeInt(this.f16979A);
        String str = this.f16981C;
        parcel.writeString(str != null ? str.toString() : null);
        CharSequence charSequence = this.f16982D;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        parcel.writeInt(this.f16983E);
        parcel.writeSerializable(this.f16985G);
        parcel.writeSerializable(this.f16987I);
        parcel.writeSerializable(this.f16988J);
        parcel.writeSerializable(this.f16989K);
        parcel.writeSerializable(this.L);
        parcel.writeSerializable(this.f16990M);
        parcel.writeSerializable(this.f16991N);
        parcel.writeSerializable(this.f16994Q);
        parcel.writeSerializable(this.f16992O);
        parcel.writeSerializable(this.f16993P);
        parcel.writeSerializable(this.f16986H);
        parcel.writeSerializable(this.f16980B);
        parcel.writeSerializable(this.f16995R);
    }
}
