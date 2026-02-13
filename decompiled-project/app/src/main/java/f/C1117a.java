package f;

import a6.C0779c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.l;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117a implements Parcelable {
    public static final Parcelable.Creator<C1117a> CREATOR = new C0779c(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f16903a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f16904b;

    public C1117a(int i7, Intent intent) {
        this.f16903a = i7;
        this.f16904b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i7 = this.f16903a;
        sb2.append(i7 != -1 ? i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED" : "RESULT_OK");
        sb2.append(", data=");
        sb2.append(this.f16904b);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        l.e(dest, "dest");
        dest.writeInt(this.f16903a);
        Intent intent = this.f16904b;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i7);
        }
    }
}
