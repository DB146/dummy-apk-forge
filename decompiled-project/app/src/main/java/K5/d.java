package K5;

import K4.l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import h3.o;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d extends c {
    public static final Parcelable.Creator<d> CREATOR = new l(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f6168a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f6169b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6170c;

    /* renamed from: d, reason: collision with root package name */
    public final h f6171d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6172e;

    /* renamed from: f, reason: collision with root package name */
    public int f6173f;

    /* renamed from: u, reason: collision with root package name */
    public int f6174u;

    public d(int i7, Parcel parcel, h hVar) {
        this.f6168a = i7;
        G.g(parcel);
        this.f6169b = parcel;
        this.f6170c = 2;
        this.f6171d = hVar;
        this.f6172e = hVar == null ? null : hVar.f6183c;
        this.f6173f = 2;
    }

    public static void e(StringBuilder sb2, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((a) entry.getValue()).f6163u, entry);
        }
        sb2.append('{');
        int d02 = com.bumptech.glide.c.d0(parcel);
        boolean z8 = false;
        while (parcel.dataPosition() < d02) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z8) {
                    sb2.append(",");
                }
                String str = (String) entry2.getKey();
                a aVar = (a) entry2.getValue();
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                J5.a aVar2 = aVar.f6167y;
                BigInteger bigInteger = null;
                BigInteger bigInteger2 = null;
                Parcel[] parcelArr = null;
                boolean[] zArr = null;
                BigDecimal[] bigDecimalArr = null;
                double[] dArr = null;
                float[] fArr = null;
                long[] jArr = null;
                BigInteger[] bigIntegerArr = null;
                Parcel obtain = null;
                int i7 = aVar.f6160d;
                if (aVar2 != null) {
                    switch (i7) {
                        case 0:
                            g(sb2, aVar, b.zaD(aVar, Integer.valueOf(com.bumptech.glide.c.Q(readInt, parcel))));
                            break;
                        case 1:
                            int U8 = com.bumptech.glide.c.U(readInt, parcel);
                            int dataPosition = parcel.dataPosition();
                            if (U8 != 0) {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + U8);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            g(sb2, aVar, b.zaD(aVar, bigInteger2));
                            break;
                        case 2:
                            g(sb2, aVar, b.zaD(aVar, Long.valueOf(com.bumptech.glide.c.S(readInt, parcel))));
                            break;
                        case 3:
                            com.bumptech.glide.c.f0(parcel, readInt, 4);
                            g(sb2, aVar, b.zaD(aVar, Float.valueOf(parcel.readFloat())));
                            break;
                        case 4:
                            com.bumptech.glide.c.f0(parcel, readInt, 8);
                            g(sb2, aVar, b.zaD(aVar, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            g(sb2, aVar, b.zaD(aVar, com.bumptech.glide.c.j(readInt, parcel)));
                            break;
                        case 6:
                            g(sb2, aVar, b.zaD(aVar, Boolean.valueOf(com.bumptech.glide.c.M(readInt, parcel))));
                            break;
                        case 7:
                            g(sb2, aVar, b.zaD(aVar, com.bumptech.glide.c.r(readInt, parcel)));
                            break;
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                            g(sb2, aVar, b.zaD(aVar, com.bumptech.glide.c.l(readInt, parcel)));
                            break;
                        case 10:
                            Bundle k = com.bumptech.glide.c.k(readInt, parcel);
                            HashMap hashMap = new HashMap();
                            for (String str2 : k.keySet()) {
                                String string = k.getString(str2);
                                G.g(string);
                                hashMap.put(str2, string);
                            }
                            g(sb2, aVar, b.zaD(aVar, hashMap));
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(o.l(i7, "Unknown field out type = "));
                    }
                } else {
                    boolean z10 = aVar.f6161e;
                    String str3 = aVar.f6165w;
                    if (z10) {
                        sb2.append("[");
                        switch (i7) {
                            case 0:
                                int[] o10 = com.bumptech.glide.c.o(readInt, parcel);
                                int length = o10.length;
                                for (int i10 = 0; i10 < length; i10++) {
                                    if (i10 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(o10[i10]);
                                }
                                break;
                            case 1:
                                int U10 = com.bumptech.glide.c.U(readInt, parcel);
                                int dataPosition2 = parcel.dataPosition();
                                if (U10 != 0) {
                                    int readInt2 = parcel.readInt();
                                    bigIntegerArr = new BigInteger[readInt2];
                                    for (int i11 = 0; i11 < readInt2; i11++) {
                                        bigIntegerArr[i11] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(dataPosition2 + U10);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i12 = 0; i12 < length2; i12++) {
                                    if (i12 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(bigIntegerArr[i12]);
                                }
                                break;
                            case 2:
                                int U11 = com.bumptech.glide.c.U(readInt, parcel);
                                int dataPosition3 = parcel.dataPosition();
                                if (U11 != 0) {
                                    jArr = parcel.createLongArray();
                                    parcel.setDataPosition(dataPosition3 + U11);
                                }
                                int length3 = jArr.length;
                                for (int i13 = 0; i13 < length3; i13++) {
                                    if (i13 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(jArr[i13]);
                                }
                                break;
                            case 3:
                                int U12 = com.bumptech.glide.c.U(readInt, parcel);
                                int dataPosition4 = parcel.dataPosition();
                                if (U12 != 0) {
                                    fArr = parcel.createFloatArray();
                                    parcel.setDataPosition(dataPosition4 + U12);
                                }
                                int length4 = fArr.length;
                                for (int i14 = 0; i14 < length4; i14++) {
                                    if (i14 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(fArr[i14]);
                                }
                                break;
                            case 4:
                                int U13 = com.bumptech.glide.c.U(readInt, parcel);
                                int dataPosition5 = parcel.dataPosition();
                                if (U13 != 0) {
                                    dArr = parcel.createDoubleArray();
                                    parcel.setDataPosition(dataPosition5 + U13);
                                }
                                int length5 = dArr.length;
                                for (int i15 = 0; i15 < length5; i15++) {
                                    if (i15 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(dArr[i15]);
                                }
                                break;
                            case 5:
                                int U14 = com.bumptech.glide.c.U(readInt, parcel);
                                int dataPosition6 = parcel.dataPosition();
                                if (U14 != 0) {
                                    int readInt3 = parcel.readInt();
                                    bigDecimalArr = new BigDecimal[readInt3];
                                    for (int i16 = 0; i16 < readInt3; i16++) {
                                        bigDecimalArr[i16] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                    }
                                    parcel.setDataPosition(dataPosition6 + U14);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i17 = 0; i17 < length6; i17++) {
                                    if (i17 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(bigDecimalArr[i17]);
                                }
                                break;
                            case 6:
                                int U15 = com.bumptech.glide.c.U(readInt, parcel);
                                int dataPosition7 = parcel.dataPosition();
                                if (U15 != 0) {
                                    zArr = parcel.createBooleanArray();
                                    parcel.setDataPosition(dataPosition7 + U15);
                                }
                                int length7 = zArr.length;
                                for (int i18 = 0; i18 < length7; i18++) {
                                    if (i18 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(zArr[i18]);
                                }
                                break;
                            case 7:
                                String[] s3 = com.bumptech.glide.c.s(readInt, parcel);
                                int length8 = s3.length;
                                for (int i19 = 0; i19 < length8; i19++) {
                                    if (i19 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append("\"");
                                    sb2.append(s3[i19]);
                                    sb2.append("\"");
                                }
                                break;
                            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                int U16 = com.bumptech.glide.c.U(readInt, parcel);
                                int dataPosition8 = parcel.dataPosition();
                                if (U16 != 0) {
                                    int readInt4 = parcel.readInt();
                                    Parcel[] parcelArr2 = new Parcel[readInt4];
                                    for (int i20 = 0; i20 < readInt4; i20++) {
                                        int readInt5 = parcel.readInt();
                                        if (readInt5 != 0) {
                                            int dataPosition9 = parcel.dataPosition();
                                            Parcel obtain2 = Parcel.obtain();
                                            obtain2.appendFrom(parcel, dataPosition9, readInt5);
                                            parcelArr2[i20] = obtain2;
                                            parcel.setDataPosition(dataPosition9 + readInt5);
                                        } else {
                                            parcelArr2[i20] = null;
                                        }
                                    }
                                    parcel.setDataPosition(dataPosition8 + U16);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i21 = 0; i21 < length9; i21++) {
                                    if (i21 > 0) {
                                        sb2.append(",");
                                    }
                                    parcelArr[i21].setDataPosition(0);
                                    G.g(str3);
                                    G.g(aVar.f6166x);
                                    Map map2 = (Map) aVar.f6166x.f6182b.get(str3);
                                    G.g(map2);
                                    e(sb2, map2, parcelArr[i21]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        sb2.append("]");
                    } else {
                        switch (i7) {
                            case 0:
                                sb2.append(com.bumptech.glide.c.Q(readInt, parcel));
                                break;
                            case 1:
                                int U17 = com.bumptech.glide.c.U(readInt, parcel);
                                int dataPosition10 = parcel.dataPosition();
                                if (U17 != 0) {
                                    byte[] createByteArray2 = parcel.createByteArray();
                                    parcel.setDataPosition(dataPosition10 + U17);
                                    bigInteger = new BigInteger(createByteArray2);
                                }
                                sb2.append(bigInteger);
                                break;
                            case 2:
                                sb2.append(com.bumptech.glide.c.S(readInt, parcel));
                                break;
                            case 3:
                                com.bumptech.glide.c.f0(parcel, readInt, 4);
                                sb2.append(parcel.readFloat());
                                break;
                            case 4:
                                com.bumptech.glide.c.f0(parcel, readInt, 8);
                                sb2.append(parcel.readDouble());
                                break;
                            case 5:
                                sb2.append(com.bumptech.glide.c.j(readInt, parcel));
                                break;
                            case 6:
                                sb2.append(com.bumptech.glide.c.M(readInt, parcel));
                                break;
                            case 7:
                                String r10 = com.bumptech.glide.c.r(readInt, parcel);
                                sb2.append("\"");
                                sb2.append(M5.d.a(r10));
                                sb2.append("\"");
                                break;
                            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                byte[] l10 = com.bumptech.glide.c.l(readInt, parcel);
                                sb2.append("\"");
                                sb2.append(l10 != null ? Base64.encodeToString(l10, 0) : null);
                                sb2.append("\"");
                                break;
                            case 9:
                                byte[] l11 = com.bumptech.glide.c.l(readInt, parcel);
                                sb2.append("\"");
                                sb2.append(l11 != null ? Base64.encodeToString(l11, 10) : null);
                                sb2.append("\"");
                                break;
                            case 10:
                                Bundle k7 = com.bumptech.glide.c.k(readInt, parcel);
                                Set<String> keySet = k7.keySet();
                                sb2.append("{");
                                boolean z11 = true;
                                for (String str4 : keySet) {
                                    if (!z11) {
                                        sb2.append(",");
                                    }
                                    sb2.append("\"");
                                    sb2.append(str4);
                                    sb2.append("\":\"");
                                    sb2.append(M5.d.a(k7.getString(str4)));
                                    sb2.append("\"");
                                    z11 = false;
                                }
                                sb2.append("}");
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                int U18 = com.bumptech.glide.c.U(readInt, parcel);
                                int dataPosition11 = parcel.dataPosition();
                                if (U18 != 0) {
                                    obtain = Parcel.obtain();
                                    obtain.appendFrom(parcel, dataPosition11, U18);
                                    parcel.setDataPosition(dataPosition11 + U18);
                                }
                                obtain.setDataPosition(0);
                                G.g(str3);
                                G.g(aVar.f6166x);
                                Map map3 = (Map) aVar.f6166x.f6182b.get(str3);
                                G.g(map3);
                                e(sb2, map3, obtain);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                }
                z8 = true;
            }
        }
        if (parcel.dataPosition() != d02) {
            throw new G5.b(o.l(d02, "Overread allowed size end="), parcel);
        }
        sb2.append('}');
    }

    public static final void f(StringBuilder sb2, int i7, Object obj) {
        switch (i7) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                G.g(obj);
                sb2.append(M5.d.a(obj.toString()));
                sb2.append("\"");
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                sb2.append("\"");
                byte[] bArr = (byte[]) obj;
                sb2.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb2.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb2.append("\"");
                return;
            case 10:
                G.g(obj);
                M5.c.k(sb2, (HashMap) obj);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(o.l(i7, "Unknown type = "));
        }
    }

    public static final void g(StringBuilder sb2, a aVar, Object obj) {
        boolean z8 = aVar.f6159c;
        int i7 = aVar.f6158b;
        if (!z8) {
            f(sb2, i7, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            f(sb2, i7, arrayList.get(i10));
        }
        sb2.append("]");
    }

    @Override // K5.b
    public final void addConcreteTypeArrayInternal(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        ArrayList arrayList2 = new ArrayList();
        G.g(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(((d) ((b) arrayList.get(i7))).c());
        }
        int i10 = aVar.f6163u;
        Parcel parcel = this.f6169b;
        int M3 = com.bumptech.glide.d.M(i10, parcel);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i11 = 0; i11 < size2; i11++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i11);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        com.bumptech.glide.d.N(M3, parcel);
    }

    @Override // K5.b
    public final void addConcreteTypeInternal(a aVar, String str, b bVar) {
        d(aVar);
        Parcel c10 = ((d) bVar).c();
        Parcel parcel = this.f6169b;
        int i7 = aVar.f6163u;
        if (c10 == null) {
            com.bumptech.glide.d.O(parcel, i7, 0);
            return;
        }
        int M3 = com.bumptech.glide.d.M(i7, parcel);
        parcel.appendFrom(c10, 0, c10.dataSize());
        com.bumptech.glide.d.N(M3, parcel);
    }

    public final Parcel c() {
        int i7 = this.f6173f;
        Parcel parcel = this.f6169b;
        if (i7 == 0) {
            int M3 = com.bumptech.glide.d.M(20293, parcel);
            this.f6174u = M3;
            com.bumptech.glide.d.N(M3, parcel);
            this.f6173f = 2;
        } else if (i7 == 1) {
            com.bumptech.glide.d.N(this.f6174u, parcel);
            this.f6173f = 2;
        }
        return parcel;
    }

    public final void d(a aVar) {
        if (aVar.f6163u == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f6169b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i7 = this.f6173f;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f6174u = com.bumptech.glide.d.M(20293, parcel);
            this.f6173f = 1;
        }
    }

    @Override // K5.b
    public final Map getFieldMappings() {
        h hVar = this.f6171d;
        if (hVar == null) {
            return null;
        }
        String str = this.f6172e;
        G.g(str);
        return (Map) hVar.f6182b.get(str);
    }

    @Override // K5.c, K5.b
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // K5.c, K5.b
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // K5.b
    public final void setBooleanInternal(a aVar, String str, boolean z8) {
        d(aVar);
        Parcel parcel = this.f6169b;
        com.bumptech.glide.d.O(parcel, aVar.f6163u, 4);
        parcel.writeInt(z8 ? 1 : 0);
    }

    @Override // K5.b
    public final void setDecodedBytesInternal(a aVar, String str, byte[] bArr) {
        d(aVar);
        com.bumptech.glide.d.A(this.f6169b, aVar.f6163u, bArr, true);
    }

    @Override // K5.b
    public final void setIntegerInternal(a aVar, String str, int i7) {
        d(aVar);
        Parcel parcel = this.f6169b;
        com.bumptech.glide.d.O(parcel, aVar.f6163u, 4);
        parcel.writeInt(i7);
    }

    @Override // K5.b
    public final void setLongInternal(a aVar, String str, long j) {
        d(aVar);
        Parcel parcel = this.f6169b;
        com.bumptech.glide.d.O(parcel, aVar.f6163u, 8);
        parcel.writeLong(j);
    }

    @Override // K5.b
    public final void setStringInternal(a aVar, String str, String str2) {
        d(aVar);
        com.bumptech.glide.d.H(this.f6169b, aVar.f6163u, str2, true);
    }

    @Override // K5.b
    public final void setStringMapInternal(a aVar, String str, Map map) {
        d(aVar);
        Bundle bundle = new Bundle();
        G.g(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        com.bumptech.glide.d.z(this.f6169b, aVar.f6163u, bundle, true);
    }

    @Override // K5.b
    public final void setStringsInternal(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        G.g(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i7 = 0; i7 < size; i7++) {
            strArr[i7] = (String) arrayList.get(i7);
        }
        com.bumptech.glide.d.I(this.f6169b, aVar.f6163u, strArr, true);
    }

    @Override // K5.b
    public final String toString() {
        h hVar = this.f6171d;
        G.h(hVar, "Cannot convert to JSON on client side.");
        Parcel c10 = c();
        c10.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        String str = this.f6172e;
        G.g(str);
        Map map = (Map) hVar.f6182b.get(str);
        G.g(map);
        e(sb2, map, c10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f6168a);
        Parcel c10 = c();
        if (c10 != null) {
            int M10 = com.bumptech.glide.d.M(2, parcel);
            parcel.appendFrom(c10, 0, c10.dataSize());
            com.bumptech.glide.d.N(M10, parcel);
        }
        com.bumptech.glide.d.G(parcel, 3, this.f6170c != 0 ? this.f6171d : null, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }

    @Override // K5.b
    public final void zab(a aVar, String str, BigDecimal bigDecimal) {
        d(aVar);
        Parcel parcel = this.f6169b;
        int i7 = aVar.f6163u;
        if (bigDecimal == null) {
            com.bumptech.glide.d.O(parcel, i7, 0);
            return;
        }
        int M3 = com.bumptech.glide.d.M(i7, parcel);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        com.bumptech.glide.d.N(M3, parcel);
    }

    @Override // K5.b
    public final void zad(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        G.g(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i7 = 0; i7 < size; i7++) {
            bigDecimalArr[i7] = (BigDecimal) arrayList.get(i7);
        }
        int i10 = aVar.f6163u;
        Parcel parcel = this.f6169b;
        int M3 = com.bumptech.glide.d.M(i10, parcel);
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(bigDecimalArr[i11].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i11].scale());
        }
        com.bumptech.glide.d.N(M3, parcel);
    }

    @Override // K5.b
    public final void zaf(a aVar, String str, BigInteger bigInteger) {
        d(aVar);
        Parcel parcel = this.f6169b;
        int i7 = aVar.f6163u;
        if (bigInteger == null) {
            com.bumptech.glide.d.O(parcel, i7, 0);
            return;
        }
        int M3 = com.bumptech.glide.d.M(i7, parcel);
        parcel.writeByteArray(bigInteger.toByteArray());
        com.bumptech.glide.d.N(M3, parcel);
    }

    @Override // K5.b
    public final void zah(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        G.g(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i7 = 0; i7 < size; i7++) {
            bigIntegerArr[i7] = (BigInteger) arrayList.get(i7);
        }
        int i10 = aVar.f6163u;
        Parcel parcel = this.f6169b;
        int M3 = com.bumptech.glide.d.M(i10, parcel);
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(bigIntegerArr[i11].toByteArray());
        }
        com.bumptech.glide.d.N(M3, parcel);
    }

    @Override // K5.b
    public final void zak(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        G.g(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i7 = 0; i7 < size; i7++) {
            zArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue();
        }
        int i10 = aVar.f6163u;
        Parcel parcel = this.f6169b;
        int M3 = com.bumptech.glide.d.M(i10, parcel);
        parcel.writeBooleanArray(zArr);
        com.bumptech.glide.d.N(M3, parcel);
    }

    @Override // K5.b
    public final void zan(a aVar, String str, double d10) {
        d(aVar);
        Parcel parcel = this.f6169b;
        com.bumptech.glide.d.O(parcel, aVar.f6163u, 8);
        parcel.writeDouble(d10);
    }

    @Override // K5.b
    public final void zap(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        G.g(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = ((Double) arrayList.get(i7)).doubleValue();
        }
        int i10 = aVar.f6163u;
        Parcel parcel = this.f6169b;
        int M3 = com.bumptech.glide.d.M(i10, parcel);
        parcel.writeDoubleArray(dArr);
        com.bumptech.glide.d.N(M3, parcel);
    }

    @Override // K5.b
    public final void zar(a aVar, String str, float f4) {
        d(aVar);
        Parcel parcel = this.f6169b;
        com.bumptech.glide.d.O(parcel, aVar.f6163u, 4);
        parcel.writeFloat(f4);
    }

    @Override // K5.b
    public final void zat(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        G.g(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            fArr[i7] = ((Float) arrayList.get(i7)).floatValue();
        }
        int i10 = aVar.f6163u;
        Parcel parcel = this.f6169b;
        int M3 = com.bumptech.glide.d.M(i10, parcel);
        parcel.writeFloatArray(fArr);
        com.bumptech.glide.d.N(M3, parcel);
    }

    @Override // K5.b
    public final void zaw(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        G.g(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        com.bumptech.glide.d.D(this.f6169b, aVar.f6163u, iArr, true);
    }

    @Override // K5.b
    public final void zaz(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        G.g(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i7 = 0; i7 < size; i7++) {
            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
        }
        int i10 = aVar.f6163u;
        Parcel parcel = this.f6169b;
        int M3 = com.bumptech.glide.d.M(i10, parcel);
        parcel.writeLongArray(jArr);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
