package K5;

import com.google.android.gms.common.internal.G;

/* loaded from: classes.dex */
public abstract class c extends b implements G5.c {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        b bVar = (b) obj;
        for (a aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                if (!bVar.isFieldSet(aVar) || !G.k(getFieldValue(aVar), bVar.getFieldValue(aVar))) {
                    return false;
                }
            } else if (bVar.isFieldSet(aVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // K5.b
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int i7 = 0;
        for (a aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                Object fieldValue = getFieldValue(aVar);
                G.g(fieldValue);
                i7 = (i7 * 31) + fieldValue.hashCode();
            }
        }
        return i7;
    }

    @Override // K5.b
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }
}
