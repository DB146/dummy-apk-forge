package M4;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new l(16);

    /* renamed from: A, reason: collision with root package name */
    public final int f6754A;

    /* renamed from: a, reason: collision with root package name */
    public final long f6755a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6756b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6757c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6758d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6759e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6760f;

    /* renamed from: u, reason: collision with root package name */
    public final long f6761u;

    /* renamed from: v, reason: collision with root package name */
    public final List f6762v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f6763w;

    /* renamed from: x, reason: collision with root package name */
    public final long f6764x;

    /* renamed from: y, reason: collision with root package name */
    public final int f6765y;

    /* renamed from: z, reason: collision with root package name */
    public final int f6766z;

    public e(long j, boolean z8, boolean z10, boolean z11, boolean z12, long j10, long j11, List list, boolean z13, long j12, int i7, int i10, int i11) {
        this.f6755a = j;
        this.f6756b = z8;
        this.f6757c = z10;
        this.f6758d = z11;
        this.f6759e = z12;
        this.f6760f = j10;
        this.f6761u = j11;
        this.f6762v = Collections.unmodifiableList(list);
        this.f6763w = z13;
        this.f6764x = j12;
        this.f6765y = i7;
        this.f6766z = i10;
        this.f6754A = i11;
    }

    public e(Parcel parcel) {
        this.f6755a = parcel.readLong();
        this.f6756b = parcel.readByte() == 1;
        this.f6757c = parcel.readByte() == 1;
        this.f6758d = parcel.readByte() == 1;
        this.f6759e = parcel.readByte() == 1;
        this.f6760f = parcel.readLong();
        this.f6761u = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f6762v = Collections.unmodifiableList(arrayList);
        this.f6763w = parcel.readByte() == 1;
        this.f6764x = parcel.readLong();
        this.f6765y = parcel.readInt();
        this.f6766z = parcel.readInt();
        this.f6754A = parcel.readInt();
    }

    @Override // M4.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f6760f);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return X.c.f(this.f6761u, " }", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f6755a);
        parcel.writeByte(this.f6756b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6757c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6758d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6759e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6760f);
        parcel.writeLong(this.f6761u);
        List list = this.f6762v;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) list.get(i10);
            parcel.writeInt(dVar.f6751a);
            parcel.writeLong(dVar.f6752b);
            parcel.writeLong(dVar.f6753c);
        }
        parcel.writeByte(this.f6763w ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6764x);
        parcel.writeInt(this.f6765y);
        parcel.writeInt(this.f6766z);
        parcel.writeInt(this.f6754A);
    }
}
