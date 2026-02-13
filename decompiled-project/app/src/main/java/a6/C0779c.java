package a6;

import a6.C0779c;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0993i;
import com.google.android.gms.common.internal.C0994j;
import com.google.android.gms.common.internal.C1001q;
import com.google.android.gms.common.internal.C1002s;
import com.google.android.gms.common.internal.C1003t;
import com.google.android.gms.common.internal.N;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.material.datepicker.p;
import com.kt.apps.core.utils.blurry.BlurFactor;
import f.C1117a;
import f.C1125i;
import f6.C1140b;
import i2.C1329q;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.l;
import l6.C1507b;
import ma.C1651b;
import ma.C1652c;
import ma.EnumC1650a;

/* renamed from: a6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12788a;

    public /* synthetic */ C0779c(int i7) {
        this.f12788a = i7;
    }

    public static void a(C0994j c0994j, Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(c0994j.f15077a);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(c0994j.f15078b);
        com.bumptech.glide.d.O(parcel, 3, 4);
        parcel.writeInt(c0994j.f15079c);
        com.bumptech.glide.d.H(parcel, 4, c0994j.f15080d, false);
        com.bumptech.glide.d.C(parcel, 5, c0994j.f15081e);
        com.bumptech.glide.d.K(parcel, 6, c0994j.f15082f, i7);
        com.bumptech.glide.d.z(parcel, 7, c0994j.f15083u, false);
        com.bumptech.glide.d.G(parcel, 8, c0994j.f15084v, i7, false);
        com.bumptech.glide.d.K(parcel, 10, c0994j.f15085w, i7);
        com.bumptech.glide.d.K(parcel, 11, c0994j.f15086x, i7);
        com.bumptech.glide.d.O(parcel, 12, 4);
        parcel.writeInt(c0994j.f15087y ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 13, 4);
        parcel.writeInt(c0994j.f15088z);
        boolean z8 = c0994j.f15075A;
        com.bumptech.glide.d.O(parcel, 14, 4);
        parcel.writeInt(z8 ? 1 : 0);
        com.bumptech.glide.d.H(parcel, 15, c0994j.f15076B, false);
        com.bumptech.glide.d.N(M3, parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:385:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x05d0  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, com.google.android.gms.common.internal.N] */
    /* JADX WARN: Type inference failed for: r1v13, types: [b.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, f6.b] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, i2.q] */
    /* JADX WARN: Type inference failed for: r1v36, types: [android.view.View$BaseSavedState, java.lang.Object, l6.b] */
    /* JADX WARN: Type inference failed for: r8v20, types: [b.a, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        int i7 = 0;
        Intent intent = null;
        Bundle bundle2 = null;
        Account account = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        b.b bVar = null;
        F5.b bVar2 = null;
        y yVar = null;
        ArrayList arrayList2 = null;
        switch (this.f12788a) {
            case 0:
                int d02 = com.bumptech.glide.c.d0(parcel);
                int i10 = 0;
                while (parcel.dataPosition() < d02) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        i7 = com.bumptech.glide.c.Q(readInt, parcel);
                    } else if (c10 == 2) {
                        i10 = com.bumptech.glide.c.Q(readInt, parcel);
                    } else if (c10 != 3) {
                        com.bumptech.glide.c.b0(readInt, parcel);
                    } else {
                        intent = (Intent) com.bumptech.glide.c.q(parcel, readInt, Intent.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d02, parcel);
                return new C0778b(i7, i10, intent);
            case 1:
                int d03 = com.bumptech.glide.c.d0(parcel);
                String str3 = null;
                while (parcel.dataPosition() < d03) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 1) {
                        arrayList2 = com.bumptech.glide.c.t(readInt2, parcel);
                    } else if (c11 != 2) {
                        com.bumptech.glide.c.b0(readInt2, parcel);
                    } else {
                        str3 = com.bumptech.glide.c.r(readInt2, parcel);
                    }
                }
                com.bumptech.glide.c.y(d03, parcel);
                return new C0782f(str3, arrayList2);
            case 2:
                int d04 = com.bumptech.glide.c.d0(parcel);
                while (parcel.dataPosition() < d04) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        i7 = com.bumptech.glide.c.Q(readInt3, parcel);
                    } else if (c12 != 2) {
                        com.bumptech.glide.c.b0(readInt3, parcel);
                    } else {
                        yVar = (y) com.bumptech.glide.c.q(parcel, readInt3, y.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d04, parcel);
                return new g(i7, yVar);
            case 3:
                int d05 = com.bumptech.glide.c.d0(parcel);
                z zVar = null;
                while (parcel.dataPosition() < d05) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 == 1) {
                        i7 = com.bumptech.glide.c.Q(readInt4, parcel);
                    } else if (c13 == 2) {
                        bVar2 = (F5.b) com.bumptech.glide.c.q(parcel, readInt4, F5.b.CREATOR);
                    } else if (c13 != 3) {
                        com.bumptech.glide.c.b0(readInt4, parcel);
                    } else {
                        zVar = (z) com.bumptech.glide.c.q(parcel, readInt4, z.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d05, parcel);
                return new h(i7, bVar2, zVar);
            case 4:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0779c(4);

                    /* renamed from: a, reason: collision with root package name */
                    public final int f12837a;

                    /* renamed from: b, reason: collision with root package name */
                    public final MediaDescriptionCompat f12838b;

                    {
                        this.f12837a = parcel.readInt();
                        this.f12838b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f12837a + ", mDescription=" + this.f12838b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i11) {
                        parcel2.writeInt(this.f12837a);
                        this.f12838b.writeToParcel(parcel2, i11);
                    }
                };
            case 5:
                Object createFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (createFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) createFromParcel;
                String g = android.support.v4.media.a.g(mediaDescription);
                CharSequence i11 = android.support.v4.media.a.i(mediaDescription);
                CharSequence h10 = android.support.v4.media.a.h(mediaDescription);
                CharSequence c14 = android.support.v4.media.a.c(mediaDescription);
                Bitmap e2 = android.support.v4.media.a.e(mediaDescription);
                Uri f4 = android.support.v4.media.a.f(mediaDescription);
                Bundle d10 = android.support.v4.media.a.d(mediaDescription);
                if (d10 != null) {
                    d10 = android.support.v4.media.session.b.H(d10);
                }
                Uri uri = d10 != null ? (Uri) d10.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uri != null) {
                    if (d10.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && d10.size() == 2) {
                        bundle = null;
                        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(g, i11, h10, c14, e2, f4, bundle, uri == null ? uri : android.support.v4.media.b.a(mediaDescription));
                        mediaDescriptionCompat.f12847w = mediaDescription;
                        return mediaDescriptionCompat;
                    }
                    d10.remove("android.support.v4.media.description.MEDIA_URI");
                    d10.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
                bundle = d10;
                MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(g, i11, h10, c14, e2, f4, bundle, uri == null ? uri : android.support.v4.media.b.a(mediaDescription));
                mediaDescriptionCompat2.f12847w = mediaDescription;
                return mediaDescriptionCompat2;
            case 6:
                return new MediaMetadataCompat(parcel);
            case 7:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                ?? obj = new Object();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i12 = b.c.f13765b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(b.b.f13764i);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof b.b)) {
                        ?? obj2 = new Object();
                        obj2.f13763a = readStrongBinder;
                        bVar = obj2;
                    } else {
                        bVar = (b.b) queryLocalInterface;
                    }
                }
                obj.f13767a = bVar;
                return obj;
            case 9:
                int d06 = com.bumptech.glide.c.d0(parcel);
                while (parcel.dataPosition() < d06) {
                    int readInt5 = parcel.readInt();
                    char c15 = (char) readInt5;
                    if (c15 == 1) {
                        i7 = com.bumptech.glide.c.Q(readInt5, parcel);
                    } else if (c15 != 2) {
                        com.bumptech.glide.c.b0(readInt5, parcel);
                    } else {
                        str2 = com.bumptech.glide.c.r(readInt5, parcel);
                    }
                }
                com.bumptech.glide.c.y(d06, parcel);
                return new Scope(i7, str2);
            case 10:
                int d07 = com.bumptech.glide.c.d0(parcel);
                PendingIntent pendingIntent = null;
                F5.b bVar3 = null;
                while (parcel.dataPosition() < d07) {
                    int readInt6 = parcel.readInt();
                    char c16 = (char) readInt6;
                    if (c16 == 1) {
                        i7 = com.bumptech.glide.c.Q(readInt6, parcel);
                    } else if (c16 == 2) {
                        str = com.bumptech.glide.c.r(readInt6, parcel);
                    } else if (c16 == 3) {
                        pendingIntent = (PendingIntent) com.bumptech.glide.c.q(parcel, readInt6, PendingIntent.CREATOR);
                    } else if (c16 != 4) {
                        com.bumptech.glide.c.b0(readInt6, parcel);
                    } else {
                        bVar3 = (F5.b) com.bumptech.glide.c.q(parcel, readInt6, F5.b.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d07, parcel);
                return new Status(i7, str, pendingIntent, bVar3);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                int d08 = com.bumptech.glide.c.d0(parcel);
                while (parcel.dataPosition() < d08) {
                    int readInt7 = parcel.readInt();
                    char c17 = (char) readInt7;
                    if (c17 == 1) {
                        i7 = com.bumptech.glide.c.Q(readInt7, parcel);
                    } else if (c17 != 2) {
                        com.bumptech.glide.c.b0(readInt7, parcel);
                    } else {
                        arrayList = com.bumptech.glide.c.v(parcel, readInt7, C1001q.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d08, parcel);
                return new C1003t(i7, arrayList);
            case 12:
                int d09 = com.bumptech.glide.c.d0(parcel);
                int i13 = -1;
                long j = 0;
                long j10 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                String str4 = null;
                String str5 = null;
                while (parcel.dataPosition() < d09) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i14 = com.bumptech.glide.c.Q(readInt8, parcel);
                            break;
                        case 2:
                            i15 = com.bumptech.glide.c.Q(readInt8, parcel);
                            break;
                        case 3:
                            i16 = com.bumptech.glide.c.Q(readInt8, parcel);
                            break;
                        case 4:
                            j = com.bumptech.glide.c.S(readInt8, parcel);
                            break;
                        case 5:
                            j10 = com.bumptech.glide.c.S(readInt8, parcel);
                            break;
                        case 6:
                            str4 = com.bumptech.glide.c.r(readInt8, parcel);
                            break;
                        case 7:
                            str5 = com.bumptech.glide.c.r(readInt8, parcel);
                            break;
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            i17 = com.bumptech.glide.c.Q(readInt8, parcel);
                            break;
                        case '\t':
                            i13 = com.bumptech.glide.c.Q(readInt8, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt8, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d09, parcel);
                return new C1001q(i14, i15, i16, j, j10, str4, str5, i17, i13);
            case 13:
                int d010 = com.bumptech.glide.c.d0(parcel);
                int i18 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < d010) {
                    int readInt9 = parcel.readInt();
                    char c18 = (char) readInt9;
                    if (c18 == 1) {
                        i7 = com.bumptech.glide.c.Q(readInt9, parcel);
                    } else if (c18 == 2) {
                        account = (Account) com.bumptech.glide.c.q(parcel, readInt9, Account.CREATOR);
                    } else if (c18 == 3) {
                        i18 = com.bumptech.glide.c.Q(readInt9, parcel);
                    } else if (c18 != 4) {
                        com.bumptech.glide.c.b0(readInt9, parcel);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) com.bumptech.glide.c.q(parcel, readInt9, GoogleSignInAccount.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d010, parcel);
                return new y(i7, account, i18, googleSignInAccount);
            case 14:
                int d011 = com.bumptech.glide.c.d0(parcel);
                int i19 = 0;
                boolean z8 = false;
                boolean z10 = false;
                IBinder iBinder = null;
                F5.b bVar4 = null;
                while (parcel.dataPosition() < d011) {
                    int readInt10 = parcel.readInt();
                    char c19 = (char) readInt10;
                    if (c19 == 1) {
                        i19 = com.bumptech.glide.c.Q(readInt10, parcel);
                    } else if (c19 == 2) {
                        iBinder = com.bumptech.glide.c.P(readInt10, parcel);
                    } else if (c19 == 3) {
                        bVar4 = (F5.b) com.bumptech.glide.c.q(parcel, readInt10, F5.b.CREATOR);
                    } else if (c19 == 4) {
                        z8 = com.bumptech.glide.c.M(readInt10, parcel);
                    } else if (c19 != 5) {
                        com.bumptech.glide.c.b0(readInt10, parcel);
                    } else {
                        z10 = com.bumptech.glide.c.M(readInt10, parcel);
                    }
                }
                com.bumptech.glide.c.y(d011, parcel);
                return new z(i19, iBinder, bVar4, z8, z10);
            case 15:
                int d012 = com.bumptech.glide.c.d0(parcel);
                int i20 = 0;
                boolean z11 = false;
                boolean z12 = false;
                int i21 = 0;
                int i22 = 0;
                while (parcel.dataPosition() < d012) {
                    int readInt11 = parcel.readInt();
                    char c20 = (char) readInt11;
                    if (c20 == 1) {
                        i20 = com.bumptech.glide.c.Q(readInt11, parcel);
                    } else if (c20 == 2) {
                        z11 = com.bumptech.glide.c.M(readInt11, parcel);
                    } else if (c20 == 3) {
                        z12 = com.bumptech.glide.c.M(readInt11, parcel);
                    } else if (c20 == 4) {
                        i21 = com.bumptech.glide.c.Q(readInt11, parcel);
                    } else if (c20 != 5) {
                        com.bumptech.glide.c.b0(readInt11, parcel);
                    } else {
                        i22 = com.bumptech.glide.c.Q(readInt11, parcel);
                    }
                }
                com.bumptech.glide.c.y(d012, parcel);
                return new C1002s(i20, z11, z12, i21, i22);
            case 16:
                int d013 = com.bumptech.glide.c.d0(parcel);
                F5.d[] dVarArr = null;
                C0993i c0993i = null;
                while (parcel.dataPosition() < d013) {
                    int readInt12 = parcel.readInt();
                    char c21 = (char) readInt12;
                    if (c21 == 1) {
                        bundle2 = com.bumptech.glide.c.k(readInt12, parcel);
                    } else if (c21 == 2) {
                        dVarArr = (F5.d[]) com.bumptech.glide.c.u(parcel, readInt12, F5.d.CREATOR);
                    } else if (c21 == 3) {
                        i7 = com.bumptech.glide.c.Q(readInt12, parcel);
                    } else if (c21 != 4) {
                        com.bumptech.glide.c.b0(readInt12, parcel);
                    } else {
                        c0993i = (C0993i) com.bumptech.glide.c.q(parcel, readInt12, C0993i.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d013, parcel);
                ?? obj3 = new Object();
                obj3.f15033a = bundle2;
                obj3.f15034b = dVarArr;
                obj3.f15035c = i7;
                obj3.f15036d = c0993i;
                return obj3;
            case 17:
                int d014 = com.bumptech.glide.c.d0(parcel);
                boolean z13 = false;
                boolean z14 = false;
                int i23 = 0;
                C1002s c1002s = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < d014) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            c1002s = (C1002s) com.bumptech.glide.c.q(parcel, readInt13, C1002s.CREATOR);
                            break;
                        case 2:
                            z13 = com.bumptech.glide.c.M(readInt13, parcel);
                            break;
                        case 3:
                            z14 = com.bumptech.glide.c.M(readInt13, parcel);
                            break;
                        case 4:
                            iArr = com.bumptech.glide.c.o(readInt13, parcel);
                            break;
                        case 5:
                            i23 = com.bumptech.glide.c.Q(readInt13, parcel);
                            break;
                        case 6:
                            iArr2 = com.bumptech.glide.c.o(readInt13, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt13, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d014, parcel);
                return new C0993i(c1002s, z13, z14, iArr, i23, iArr2);
            case 18:
                int d015 = com.bumptech.glide.c.d0(parcel);
                Scope[] scopeArr = C0994j.f15073C;
                Bundle bundle3 = new Bundle();
                F5.d[] dVarArr2 = C0994j.f15074D;
                F5.d[] dVarArr3 = dVarArr2;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                boolean z15 = false;
                int i27 = 0;
                boolean z16 = false;
                String str6 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str7 = null;
                while (parcel.dataPosition() < d015) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i24 = com.bumptech.glide.c.Q(readInt14, parcel);
                            break;
                        case 2:
                            i25 = com.bumptech.glide.c.Q(readInt14, parcel);
                            break;
                        case 3:
                            i26 = com.bumptech.glide.c.Q(readInt14, parcel);
                            break;
                        case 4:
                            str6 = com.bumptech.glide.c.r(readInt14, parcel);
                            break;
                        case 5:
                            iBinder2 = com.bumptech.glide.c.P(readInt14, parcel);
                            break;
                        case 6:
                            scopeArr = (Scope[]) com.bumptech.glide.c.u(parcel, readInt14, Scope.CREATOR);
                            break;
                        case 7:
                            bundle3 = com.bumptech.glide.c.k(readInt14, parcel);
                            break;
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            account2 = (Account) com.bumptech.glide.c.q(parcel, readInt14, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            com.bumptech.glide.c.b0(readInt14, parcel);
                            break;
                        case '\n':
                            dVarArr2 = (F5.d[]) com.bumptech.glide.c.u(parcel, readInt14, F5.d.CREATOR);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            dVarArr3 = (F5.d[]) com.bumptech.glide.c.u(parcel, readInt14, F5.d.CREATOR);
                            break;
                        case '\f':
                            z15 = com.bumptech.glide.c.M(readInt14, parcel);
                            break;
                        case '\r':
                            i27 = com.bumptech.glide.c.Q(readInt14, parcel);
                            break;
                        case 14:
                            z16 = com.bumptech.glide.c.M(readInt14, parcel);
                            break;
                        case 15:
                            str7 = com.bumptech.glide.c.r(readInt14, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d015, parcel);
                return new C0994j(i24, i25, i26, str6, iBinder2, scopeArr, bundle3, account2, dVarArr2, dVarArr3, z15, i27, z16, str7);
            case 19:
                return new com.google.android.material.datepicker.b((p) parcel.readParcelable(p.class.getClassLoader()), (p) parcel.readParcelable(p.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (p) parcel.readParcelable(p.class.getClassLoader()), parcel.readInt());
            case 20:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 21:
                return p.a(parcel.readInt(), parcel.readInt());
            case 22:
                return new ParcelImpl(parcel);
            case 23:
                l.e(parcel, "parcel");
                return new C1117a(parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
            case 24:
                l.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                l.b(readParcelable);
                return new C1125i((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                ?? obj4 = new Object();
                obj4.f17004w = 255;
                obj4.f17006y = -2;
                obj4.f17007z = -2;
                obj4.f16979A = -2;
                obj4.f16986H = Boolean.TRUE;
                obj4.f16996a = parcel.readInt();
                obj4.f16997b = (Integer) parcel.readSerializable();
                obj4.f16998c = (Integer) parcel.readSerializable();
                obj4.f16999d = (Integer) parcel.readSerializable();
                obj4.f17000e = (Integer) parcel.readSerializable();
                obj4.f17001f = (Integer) parcel.readSerializable();
                obj4.f17002u = (Integer) parcel.readSerializable();
                obj4.f17003v = (Integer) parcel.readSerializable();
                obj4.f17004w = parcel.readInt();
                obj4.f17005x = parcel.readString();
                obj4.f17006y = parcel.readInt();
                obj4.f17007z = parcel.readInt();
                obj4.f16979A = parcel.readInt();
                obj4.f16981C = parcel.readString();
                obj4.f16982D = parcel.readString();
                obj4.f16983E = parcel.readInt();
                obj4.f16985G = (Integer) parcel.readSerializable();
                obj4.f16987I = (Integer) parcel.readSerializable();
                obj4.f16988J = (Integer) parcel.readSerializable();
                obj4.f16989K = (Integer) parcel.readSerializable();
                obj4.L = (Integer) parcel.readSerializable();
                obj4.f16990M = (Integer) parcel.readSerializable();
                obj4.f16991N = (Integer) parcel.readSerializable();
                obj4.f16994Q = (Integer) parcel.readSerializable();
                obj4.f16992O = (Integer) parcel.readSerializable();
                obj4.f16993P = (Integer) parcel.readSerializable();
                obj4.f16986H = (Boolean) parcel.readSerializable();
                obj4.f16980B = (Locale) parcel.readSerializable();
                obj4.f16995R = (Boolean) parcel.readSerializable();
                return obj4;
            case 26:
                ?? obj5 = new Object();
                obj5.f18291b = Bundle.EMPTY;
                obj5.f18290a = parcel.readInt();
                obj5.f18291b = parcel.readBundle(GridLayoutManager.class.getClassLoader());
                return obj5;
            case 27:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f19561a = ((Integer) parcel.readValue(C1507b.class.getClassLoader())).intValue();
                return baseSavedState;
            case 28:
                l.e(parcel, "parcel");
                Parcelable.Creator<ma.f> creator = ma.f.CREATOR;
                return new C1651b(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), EnumC1650a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            default:
                l.e(parcel, "parcel");
                C1651b createFromParcel2 = C1651b.CREATOR.createFromParcel(parcel);
                int readInt15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt15);
                while (i7 != readInt15) {
                    arrayList3.add(ma.g.CREATOR.createFromParcel(parcel));
                    i7++;
                }
                return new C1652c(createFromParcel2, arrayList3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f12788a) {
            case 0:
                return new C0778b[i7];
            case 1:
                return new C0782f[i7];
            case 2:
                return new g[i7];
            case 3:
                return new h[i7];
            case 4:
                return new MediaBrowserCompat$MediaItem[i7];
            case 5:
                return new MediaDescriptionCompat[i7];
            case 6:
                return new MediaMetadataCompat[i7];
            case 7:
                return new RatingCompat[i7];
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new b.d[i7];
            case 9:
                return new Scope[i7];
            case 10:
                return new Status[i7];
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new C1003t[i7];
            case 12:
                return new C1001q[i7];
            case 13:
                return new y[i7];
            case 14:
                return new z[i7];
            case 15:
                return new C1002s[i7];
            case 16:
                return new N[i7];
            case 17:
                return new C0993i[i7];
            case 18:
                return new C0994j[i7];
            case 19:
                return new com.google.android.material.datepicker.b[i7];
            case 20:
                return new com.google.android.material.datepicker.d[i7];
            case 21:
                return new p[i7];
            case 22:
                return new ParcelImpl[i7];
            case 23:
                return new C1117a[i7];
            case 24:
                return new C1125i[i7];
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return new C1140b[i7];
            case 26:
                return new C1329q[i7];
            case 27:
                return new C1507b[i7];
            case 28:
                return new C1651b[i7];
            default:
                return new C1652c[i7];
        }
    }
}
