package K4;

import N6.H;
import N6.t0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.ArrayList;
import m4.C1560b0;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new l(2);

    /* renamed from: b, reason: collision with root package name */
    public final String f6153b;

    /* renamed from: c, reason: collision with root package name */
    public final H f6154c;

    public o(String str, String str2, t0 t0Var) {
        super(str);
        AbstractC1705a.h(!t0Var.isEmpty());
        this.f6153b = str2;
        H F10 = H.F(t0Var);
        this.f6154c = F10;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return D.a(this.f6141a, oVar.f6141a) && D.a(this.f6153b, oVar.f6153b) && this.f6154c.equals(oVar.f6154c);
    }

    public final int hashCode() {
        int d10 = A3.c.d(527, 31, this.f6141a);
        String str = this.f6153b;
        return this.f6154c.hashCode() + ((d10 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // F4.b
    public final void i(C1560b0 c1560b0) {
        String str = this.f6141a;
        str.getClass();
        H h10 = this.f6154c;
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    c1560b0.f20241c = (CharSequence) h10.get(0);
                    return;
                case 1:
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    c1560b0.f20260y = (CharSequence) h10.get(0);
                    return;
                case 2:
                case '\f':
                    String str2 = (String) h10.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    c1560b0.c(Integer.valueOf(parseInt));
                    c1560b0.b(Integer.valueOf(parseInt2));
                    return;
                case 3:
                case 17:
                    c1560b0.f20240b = (CharSequence) h10.get(0);
                    return;
                case 4:
                case 18:
                    c1560b0.f20242d = (CharSequence) h10.get(0);
                    return;
                case 5:
                case 19:
                    c1560b0.f20261z = (CharSequence) h10.get(0);
                    return;
                case 6:
                case 20:
                    String[] W10 = D.W((String) h10.get(0), "/");
                    int parseInt3 = Integer.parseInt(W10[0]);
                    Integer valueOf = W10.length > 1 ? Integer.valueOf(Integer.parseInt(W10[1])) : null;
                    c1560b0.f20248m = Integer.valueOf(parseInt3);
                    c1560b0.f20249n = valueOf;
                    return;
                case 7:
                case 16:
                    c1560b0.f20239a = (CharSequence) h10.get(0);
                    return;
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                case 15:
                    c1560b0.f20259x = (CharSequence) h10.get(0);
                    return;
                case '\t':
                case 21:
                    c1560b0.d(Integer.valueOf(Integer.parseInt((String) h10.get(0))));
                    return;
                case '\r':
                    ArrayList a9 = a((String) h10.get(0));
                    int size = a9.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            } else {
                                c1560b0.b((Integer) a9.get(2));
                            }
                        }
                        c1560b0.c((Integer) a9.get(1));
                    }
                    c1560b0.d((Integer) a9.get(0));
                    return;
                case 14:
                    ArrayList a10 = a((String) h10.get(0));
                    int size2 = a10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            } else {
                                c1560b0.f20258w = (Integer) a10.get(2);
                            }
                        }
                        c1560b0.f20257v = (Integer) a10.get(1);
                    }
                    c1560b0.f20256u = (Integer) a10.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // K4.j
    public final String toString() {
        return this.f6141a + ": description=" + this.f6153b + ": values=" + this.f6154c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6141a);
        parcel.writeString(this.f6153b);
        parcel.writeStringArray((String[]) this.f6154c.toArray(new String[0]));
    }
}
