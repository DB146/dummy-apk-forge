package U5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new T(29);

    /* renamed from: a, reason: collision with root package name */
    public final Enum f9784a;

    /* JADX WARN: Multi-variable type inference failed */
    public r(InterfaceC0533a interfaceC0533a) {
        this.f9784a = (Enum) interfaceC0533a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r a(int i7) {
        G g;
        if (i7 == -262) {
            g = G.RS1;
        } else {
            G[] values = G.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    for (EnumC0550s enumC0550s : EnumC0550s.values()) {
                        if (enumC0550s.f9786a == i7) {
                            g = enumC0550s;
                        }
                    }
                    throw new Exception(A3.c.f(i7, "Algorithm with COSE value ", " not supported"));
                }
                G g2 = values[i10];
                if (g2.f9711a == i7) {
                    g = g2;
                    break;
                }
                i10++;
            }
        }
        return new r(g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Enum, U5.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, U5.a] */
    public final boolean equals(Object obj) {
        return (obj instanceof r) && this.f9784a.a() == ((r) obj).f9784a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9784a});
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, U5.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f9784a.a());
    }
}
