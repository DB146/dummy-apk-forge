package d3;

import android.os.Parcel;
import android.util.SparseIntArray;
import h3.o;
import u.C2052e;
import u.T;

/* renamed from: d3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046b extends AbstractC1045a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f16510d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f16511e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16512f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final String f16513h;

    /* renamed from: i, reason: collision with root package name */
    public int f16514i;
    public int j;
    public int k;

    /* JADX WARN: Type inference failed for: r5v0, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r6v0, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r7v0, types: [u.T, u.e] */
    public C1046b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new T(0), new T(0), new T(0));
    }

    public C1046b(Parcel parcel, int i7, int i10, String str, C2052e c2052e, C2052e c2052e2, C2052e c2052e3) {
        super(c2052e, c2052e2, c2052e3);
        this.f16510d = new SparseIntArray();
        this.f16514i = -1;
        this.k = -1;
        this.f16511e = parcel;
        this.f16512f = i7;
        this.g = i10;
        this.j = i7;
        this.f16513h = str;
    }

    @Override // d3.AbstractC1045a
    public final C1046b a() {
        Parcel parcel = this.f16511e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.j;
        if (i7 == this.f16512f) {
            i7 = this.g;
        }
        return new C1046b(parcel, dataPosition, i7, o.p(new StringBuilder(), this.f16513h, "  "), this.f16507a, this.f16508b, this.f16509c);
    }

    @Override // d3.AbstractC1045a
    public final boolean e(int i7) {
        while (this.j < this.g) {
            int i10 = this.k;
            if (i10 == i7) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            int i11 = this.j;
            Parcel parcel = this.f16511e;
            parcel.setDataPosition(i11);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        return this.k == i7;
    }

    @Override // d3.AbstractC1045a
    public final void i(int i7) {
        int i10 = this.f16514i;
        SparseIntArray sparseIntArray = this.f16510d;
        Parcel parcel = this.f16511e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f16514i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }
}
