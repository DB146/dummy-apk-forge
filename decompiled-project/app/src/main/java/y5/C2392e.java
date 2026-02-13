package y5;

import U5.C0555x;
import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import h3.o;
import java.util.ArrayList;
import java.util.HashSet;
import z5.C2596a;
import z5.C2597b;
import z5.i;
import z5.j;
import z5.k;
import z5.l;
import z5.m;
import z5.p;

/* renamed from: y5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2392e implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26978a;

    public /* synthetic */ C2392e(int i7) {
        this.f26978a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f26978a) {
            case 0:
                int d02 = com.bumptech.glide.c.d0(parcel);
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                int i7 = 0;
                while (parcel.dataPosition() < d02) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i7 = com.bumptech.glide.c.Q(readInt, parcel);
                            break;
                        case 2:
                            arrayList = com.bumptech.glide.c.t(readInt, parcel);
                            break;
                        case 3:
                            arrayList2 = com.bumptech.glide.c.t(readInt, parcel);
                            break;
                        case 4:
                            arrayList3 = com.bumptech.glide.c.t(readInt, parcel);
                            break;
                        case 5:
                            arrayList4 = com.bumptech.glide.c.t(readInt, parcel);
                            break;
                        case 6:
                            arrayList5 = com.bumptech.glide.c.t(readInt, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d02, parcel);
                return new C2391d(i7, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
            case 1:
                int d03 = com.bumptech.glide.c.d0(parcel);
                HashSet hashSet = new HashSet();
                int i10 = 0;
                C2394g c2394g = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                while (parcel.dataPosition() < d03) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        i10 = com.bumptech.glide.c.Q(readInt2, parcel);
                        hashSet.add(1);
                    } else if (c10 == 2) {
                        c2394g = (C2394g) com.bumptech.glide.c.q(parcel, readInt2, C2394g.CREATOR);
                        hashSet.add(2);
                    } else if (c10 == 3) {
                        str = com.bumptech.glide.c.r(readInt2, parcel);
                        hashSet.add(3);
                    } else if (c10 == 4) {
                        str2 = com.bumptech.glide.c.r(readInt2, parcel);
                        hashSet.add(4);
                    } else if (c10 != 5) {
                        com.bumptech.glide.c.b0(readInt2, parcel);
                    } else {
                        str3 = com.bumptech.glide.c.r(readInt2, parcel);
                        hashSet.add(5);
                    }
                }
                if (parcel.dataPosition() == d03) {
                    return new C2393f(hashSet, i10, c2394g, str, str2, str3);
                }
                throw new G5.b(o.l(d03, "Overread allowed size end="), parcel);
            case 2:
                int d04 = com.bumptech.glide.c.d0(parcel);
                HashSet hashSet2 = new HashSet();
                int i11 = 0;
                String str4 = null;
                byte[] bArr = null;
                PendingIntent pendingIntent = null;
                C2388a c2388a = null;
                int i12 = 0;
                while (parcel.dataPosition() < d04) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i11 = com.bumptech.glide.c.Q(readInt3, parcel);
                            hashSet2.add(1);
                            break;
                        case 2:
                            str4 = com.bumptech.glide.c.r(readInt3, parcel);
                            hashSet2.add(2);
                            break;
                        case 3:
                            i12 = com.bumptech.glide.c.Q(readInt3, parcel);
                            hashSet2.add(3);
                            break;
                        case 4:
                            bArr = com.bumptech.glide.c.l(readInt3, parcel);
                            hashSet2.add(4);
                            break;
                        case 5:
                            pendingIntent = (PendingIntent) com.bumptech.glide.c.q(parcel, readInt3, PendingIntent.CREATOR);
                            hashSet2.add(5);
                            break;
                        case 6:
                            c2388a = (C2388a) com.bumptech.glide.c.q(parcel, readInt3, C2388a.CREATOR);
                            hashSet2.add(6);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt3, parcel);
                            break;
                    }
                }
                if (parcel.dataPosition() == d04) {
                    return new C2394g(hashSet2, i11, str4, i12, bArr, pendingIntent, c2388a);
                }
                throw new G5.b(o.l(d04, "Overread allowed size end="), parcel);
            case 3:
                int d05 = com.bumptech.glide.c.d0(parcel);
                int i13 = 0;
                boolean z8 = false;
                boolean z10 = false;
                long j = 0;
                while (parcel.dataPosition() < d05) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        i13 = com.bumptech.glide.c.Q(readInt4, parcel);
                    } else if (c11 == 2) {
                        z8 = com.bumptech.glide.c.M(readInt4, parcel);
                    } else if (c11 == 3) {
                        j = com.bumptech.glide.c.S(readInt4, parcel);
                    } else if (c11 != 4) {
                        com.bumptech.glide.c.b0(readInt4, parcel);
                    } else {
                        z10 = com.bumptech.glide.c.M(readInt4, parcel);
                    }
                }
                com.bumptech.glide.c.y(d05, parcel);
                return new C2388a(i13, z8, j, z10);
            case 4:
                int d06 = com.bumptech.glide.c.d0(parcel);
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                ArrayList arrayList6 = null;
                String str5 = null;
                Account account = null;
                String str6 = null;
                String str7 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < d06) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            arrayList6 = com.bumptech.glide.c.v(parcel, readInt5, Scope.CREATOR);
                            break;
                        case 2:
                            str5 = com.bumptech.glide.c.r(readInt5, parcel);
                            break;
                        case 3:
                            z11 = com.bumptech.glide.c.M(readInt5, parcel);
                            break;
                        case 4:
                            z12 = com.bumptech.glide.c.M(readInt5, parcel);
                            break;
                        case 5:
                            account = (Account) com.bumptech.glide.c.q(parcel, readInt5, Account.CREATOR);
                            break;
                        case 6:
                            str6 = com.bumptech.glide.c.r(readInt5, parcel);
                            break;
                        case 7:
                            str7 = com.bumptech.glide.c.r(readInt5, parcel);
                            break;
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            z13 = com.bumptech.glide.c.M(readInt5, parcel);
                            break;
                        case '\t':
                            bundle = com.bumptech.glide.c.k(readInt5, parcel);
                            break;
                        case '\n':
                            z14 = com.bumptech.glide.c.M(readInt5, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt5, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d06, parcel);
                return new AuthorizationRequest(arrayList6, str5, z11, z12, account, str6, str7, z13, bundle, z14);
            case 5:
                int d07 = com.bumptech.glide.c.d0(parcel);
                String str8 = null;
                String str9 = null;
                String str10 = null;
                ArrayList arrayList7 = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < d07) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            str8 = com.bumptech.glide.c.r(readInt6, parcel);
                            break;
                        case 2:
                            str9 = com.bumptech.glide.c.r(readInt6, parcel);
                            break;
                        case 3:
                            str10 = com.bumptech.glide.c.r(readInt6, parcel);
                            break;
                        case 4:
                            arrayList7 = com.bumptech.glide.c.t(readInt6, parcel);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) com.bumptech.glide.c.q(parcel, readInt6, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent2 = (PendingIntent) com.bumptech.glide.c.q(parcel, readInt6, PendingIntent.CREATOR);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt6, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d07, parcel);
                return new C2596a(str8, str9, str10, arrayList7, googleSignInAccount, pendingIntent2);
            case 6:
                int d08 = com.bumptech.glide.c.d0(parcel);
                boolean z15 = false;
                int i14 = 0;
                boolean z16 = false;
                z5.e eVar = null;
                C2597b c2597b = null;
                String str11 = null;
                z5.d dVar = null;
                z5.c cVar = null;
                while (parcel.dataPosition() < d08) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            eVar = (z5.e) com.bumptech.glide.c.q(parcel, readInt7, z5.e.CREATOR);
                            break;
                        case 2:
                            c2597b = (C2597b) com.bumptech.glide.c.q(parcel, readInt7, C2597b.CREATOR);
                            break;
                        case 3:
                            str11 = com.bumptech.glide.c.r(readInt7, parcel);
                            break;
                        case 4:
                            z15 = com.bumptech.glide.c.M(readInt7, parcel);
                            break;
                        case 5:
                            i14 = com.bumptech.glide.c.Q(readInt7, parcel);
                            break;
                        case 6:
                            dVar = (z5.d) com.bumptech.glide.c.q(parcel, readInt7, z5.d.CREATOR);
                            break;
                        case 7:
                            cVar = (z5.c) com.bumptech.glide.c.q(parcel, readInt7, z5.c.CREATOR);
                            break;
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            z16 = com.bumptech.glide.c.M(readInt7, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt7, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d08, parcel);
                return new z5.f(eVar, c2597b, str11, z15, i14, dVar, cVar, z16);
            case 7:
                int d09 = com.bumptech.glide.c.d0(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < d09) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        com.bumptech.glide.c.b0(readInt8, parcel);
                    } else {
                        pendingIntent3 = (PendingIntent) com.bumptech.glide.c.q(parcel, readInt8, PendingIntent.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d09, parcel);
                return new z5.g(pendingIntent3);
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                int d010 = com.bumptech.glide.c.d0(parcel);
                int i15 = 0;
                while (parcel.dataPosition() < d010) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        com.bumptech.glide.c.b0(readInt9, parcel);
                    } else {
                        i15 = com.bumptech.glide.c.Q(readInt9, parcel);
                    }
                }
                com.bumptech.glide.c.y(d010, parcel);
                return new i(i15);
            case 9:
                int d011 = com.bumptech.glide.c.d0(parcel);
                boolean z17 = false;
                int i16 = 0;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                while (parcel.dataPosition() < d011) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            str12 = com.bumptech.glide.c.r(readInt10, parcel);
                            break;
                        case 2:
                            str13 = com.bumptech.glide.c.r(readInt10, parcel);
                            break;
                        case 3:
                            str14 = com.bumptech.glide.c.r(readInt10, parcel);
                            break;
                        case 4:
                            str15 = com.bumptech.glide.c.r(readInt10, parcel);
                            break;
                        case 5:
                            z17 = com.bumptech.glide.c.M(readInt10, parcel);
                            break;
                        case 6:
                            i16 = com.bumptech.glide.c.Q(readInt10, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt10, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d011, parcel);
                return new j(str12, str13, z17, str14, i16, str15);
            case 10:
                int d012 = com.bumptech.glide.c.d0(parcel);
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                ArrayList arrayList8 = null;
                while (parcel.dataPosition() < d012) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            z18 = com.bumptech.glide.c.M(readInt11, parcel);
                            break;
                        case 2:
                            str16 = com.bumptech.glide.c.r(readInt11, parcel);
                            break;
                        case 3:
                            str17 = com.bumptech.glide.c.r(readInt11, parcel);
                            break;
                        case 4:
                            z19 = com.bumptech.glide.c.M(readInt11, parcel);
                            break;
                        case 5:
                            str18 = com.bumptech.glide.c.r(readInt11, parcel);
                            break;
                        case 6:
                            arrayList8 = com.bumptech.glide.c.t(readInt11, parcel);
                            break;
                        case 7:
                            z20 = com.bumptech.glide.c.M(readInt11, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt11, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d012, parcel);
                return new C2597b(z18, str16, str17, z19, str18, arrayList8, z20);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                int d013 = com.bumptech.glide.c.d0(parcel);
                String str19 = null;
                boolean z21 = false;
                while (parcel.dataPosition() < d013) {
                    int readInt12 = parcel.readInt();
                    char c12 = (char) readInt12;
                    if (c12 == 1) {
                        z21 = com.bumptech.glide.c.M(readInt12, parcel);
                    } else if (c12 != 2) {
                        com.bumptech.glide.c.b0(readInt12, parcel);
                    } else {
                        str19 = com.bumptech.glide.c.r(readInt12, parcel);
                    }
                }
                com.bumptech.glide.c.y(d013, parcel);
                return new z5.c(str19, z21);
            case 12:
                int d014 = com.bumptech.glide.c.d0(parcel);
                byte[] bArr2 = null;
                boolean z22 = false;
                String str20 = null;
                while (parcel.dataPosition() < d014) {
                    int readInt13 = parcel.readInt();
                    char c13 = (char) readInt13;
                    if (c13 == 1) {
                        z22 = com.bumptech.glide.c.M(readInt13, parcel);
                    } else if (c13 == 2) {
                        bArr2 = com.bumptech.glide.c.l(readInt13, parcel);
                    } else if (c13 != 3) {
                        com.bumptech.glide.c.b0(readInt13, parcel);
                    } else {
                        str20 = com.bumptech.glide.c.r(readInt13, parcel);
                    }
                }
                com.bumptech.glide.c.y(d014, parcel);
                return new z5.d(bArr2, str20, z22);
            case 13:
                int d015 = com.bumptech.glide.c.d0(parcel);
                boolean z23 = false;
                while (parcel.dataPosition() < d015) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        com.bumptech.glide.c.b0(readInt14, parcel);
                    } else {
                        z23 = com.bumptech.glide.c.M(readInt14, parcel);
                    }
                }
                com.bumptech.glide.c.y(d015, parcel);
                return new z5.e(z23);
            case 14:
                int d016 = com.bumptech.glide.c.d0(parcel);
                int i17 = 0;
                PendingIntent pendingIntent4 = null;
                String str21 = null;
                String str22 = null;
                ArrayList arrayList9 = null;
                String str23 = null;
                while (parcel.dataPosition() < d016) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            pendingIntent4 = (PendingIntent) com.bumptech.glide.c.q(parcel, readInt15, PendingIntent.CREATOR);
                            break;
                        case 2:
                            str21 = com.bumptech.glide.c.r(readInt15, parcel);
                            break;
                        case 3:
                            str22 = com.bumptech.glide.c.r(readInt15, parcel);
                            break;
                        case 4:
                            arrayList9 = com.bumptech.glide.c.t(readInt15, parcel);
                            break;
                        case 5:
                            str23 = com.bumptech.glide.c.r(readInt15, parcel);
                            break;
                        case 6:
                            i17 = com.bumptech.glide.c.Q(readInt15, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt15, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d016, parcel);
                return new SaveAccountLinkingTokenRequest(pendingIntent4, str21, str22, arrayList9, str23, i17);
            case 15:
                int d017 = com.bumptech.glide.c.d0(parcel);
                PendingIntent pendingIntent5 = null;
                while (parcel.dataPosition() < d017) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        com.bumptech.glide.c.b0(readInt16, parcel);
                    } else {
                        pendingIntent5 = (PendingIntent) com.bumptech.glide.c.q(parcel, readInt16, PendingIntent.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d017, parcel);
                return new k(pendingIntent5);
            case 16:
                int d018 = com.bumptech.glide.c.d0(parcel);
                int i18 = 0;
                p pVar = null;
                String str24 = null;
                while (parcel.dataPosition() < d018) {
                    int readInt17 = parcel.readInt();
                    char c14 = (char) readInt17;
                    if (c14 == 1) {
                        pVar = (p) com.bumptech.glide.c.q(parcel, readInt17, p.CREATOR);
                    } else if (c14 == 2) {
                        str24 = com.bumptech.glide.c.r(readInt17, parcel);
                    } else if (c14 != 3) {
                        com.bumptech.glide.c.b0(readInt17, parcel);
                    } else {
                        i18 = com.bumptech.glide.c.Q(readInt17, parcel);
                    }
                }
                com.bumptech.glide.c.y(d018, parcel);
                return new l(pVar, str24, i18);
            case 17:
                int d019 = com.bumptech.glide.c.d0(parcel);
                PendingIntent pendingIntent6 = null;
                while (parcel.dataPosition() < d019) {
                    int readInt18 = parcel.readInt();
                    if (((char) readInt18) != 1) {
                        com.bumptech.glide.c.b0(readInt18, parcel);
                    } else {
                        pendingIntent6 = (PendingIntent) com.bumptech.glide.c.q(parcel, readInt18, PendingIntent.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d019, parcel);
                return new m(pendingIntent6);
            case 18:
                int d020 = com.bumptech.glide.c.d0(parcel);
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                Uri uri = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                C0555x c0555x = null;
                while (parcel.dataPosition() < d020) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            str25 = com.bumptech.glide.c.r(readInt19, parcel);
                            break;
                        case 2:
                            str26 = com.bumptech.glide.c.r(readInt19, parcel);
                            break;
                        case 3:
                            str27 = com.bumptech.glide.c.r(readInt19, parcel);
                            break;
                        case 4:
                            str28 = com.bumptech.glide.c.r(readInt19, parcel);
                            break;
                        case 5:
                            uri = (Uri) com.bumptech.glide.c.q(parcel, readInt19, Uri.CREATOR);
                            break;
                        case 6:
                            str29 = com.bumptech.glide.c.r(readInt19, parcel);
                            break;
                        case 7:
                            str30 = com.bumptech.glide.c.r(readInt19, parcel);
                            break;
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            str31 = com.bumptech.glide.c.r(readInt19, parcel);
                            break;
                        case '\t':
                            c0555x = (C0555x) com.bumptech.glide.c.q(parcel, readInt19, C0555x.CREATOR);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt19, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d020, parcel);
                return new z5.o(str25, str26, str27, str28, uri, str29, str30, str31, c0555x);
            default:
                int d021 = com.bumptech.glide.c.d0(parcel);
                String str32 = null;
                String str33 = null;
                while (parcel.dataPosition() < d021) {
                    int readInt20 = parcel.readInt();
                    char c15 = (char) readInt20;
                    if (c15 == 1) {
                        str32 = com.bumptech.glide.c.r(readInt20, parcel);
                    } else if (c15 != 2) {
                        com.bumptech.glide.c.b0(readInt20, parcel);
                    } else {
                        str33 = com.bumptech.glide.c.r(readInt20, parcel);
                    }
                }
                com.bumptech.glide.c.y(d021, parcel);
                return new p(str32, str33);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f26978a) {
            case 0:
                return new C2391d[i7];
            case 1:
                return new C2393f[i7];
            case 2:
                return new C2394g[i7];
            case 3:
                return new C2388a[i7];
            case 4:
                return new AuthorizationRequest[i7];
            case 5:
                return new C2596a[i7];
            case 6:
                return new z5.f[i7];
            case 7:
                return new z5.g[i7];
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new i[i7];
            case 9:
                return new j[i7];
            case 10:
                return new C2597b[i7];
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new z5.c[i7];
            case 12:
                return new z5.d[i7];
            case 13:
                return new z5.e[i7];
            case 14:
                return new SaveAccountLinkingTokenRequest[i7];
            case 15:
                return new k[i7];
            case 16:
                return new l[i7];
            case 17:
                return new m[i7];
            case 18:
                return new z5.o[i7];
            default:
                return new p[i7];
        }
    }
}
