package f;

import a6.C0779c;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.l;

/* renamed from: f.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1125i implements Parcelable {
    public static final Parcelable.Creator<C1125i> CREATOR = new C0779c(24);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f16918a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f16919b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16920c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16921d;

    public C1125i(IntentSender intentSender, Intent intent, int i7, int i10) {
        this.f16918a = intentSender;
        this.f16919b = intent;
        this.f16920c = i7;
        this.f16921d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        l.e(dest, "dest");
        dest.writeParcelable(this.f16918a, i7);
        dest.writeParcelable(this.f16919b, i7);
        dest.writeInt(this.f16920c);
        dest.writeInt(this.f16921d);
    }
}
