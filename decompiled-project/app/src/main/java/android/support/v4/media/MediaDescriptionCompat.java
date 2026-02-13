package android.support.v4.media;

import a6.C0779c;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0779c(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f12839a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f12840b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f12841c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f12842d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f12843e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f12844f;

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f12845u;

    /* renamed from: v, reason: collision with root package name */
    public final Uri f12846v;

    /* renamed from: w, reason: collision with root package name */
    public MediaDescription f12847w;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f12839a = str;
        this.f12840b = charSequence;
        this.f12841c = charSequence2;
        this.f12842d = charSequence3;
        this.f12843e = bitmap;
        this.f12844f = uri;
        this.f12845u = bundle;
        this.f12846v = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f12840b) + ", " + ((Object) this.f12841c) + ", " + ((Object) this.f12842d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        MediaDescription mediaDescription = this.f12847w;
        if (mediaDescription == null) {
            MediaDescription.Builder b2 = a.b();
            a.n(b2, this.f12839a);
            a.p(b2, this.f12840b);
            a.o(b2, this.f12841c);
            a.j(b2, this.f12842d);
            a.l(b2, this.f12843e);
            a.m(b2, this.f12844f);
            a.k(b2, this.f12845u);
            b.b(b2, this.f12846v);
            mediaDescription = a.a(b2);
            this.f12847w = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i7);
    }
}
