package C5;

import P1.g;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2917a;

    public /* synthetic */ d(int i7) {
        this.f2917a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2917a) {
            case 0:
                int d02 = com.bumptech.glide.c.d0(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList = null;
                String str7 = null;
                String str8 = null;
                long j = 0;
                int i7 = 0;
                while (parcel.dataPosition() < d02) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i7 = com.bumptech.glide.c.Q(readInt, parcel);
                            break;
                        case 2:
                            str = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        case 3:
                            str2 = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        case 4:
                            str3 = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        case 5:
                            str4 = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        case 6:
                            uri = (Uri) com.bumptech.glide.c.q(parcel, readInt, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        case g.BYTES_FIELD_NUMBER /* 8 */:
                            j = com.bumptech.glide.c.S(readInt, parcel);
                            break;
                        case '\t':
                            str6 = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        case '\n':
                            arrayList = com.bumptech.glide.c.v(parcel, readInt, Scope.CREATOR);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            str7 = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        case '\f':
                            str8 = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d02, parcel);
                return new GoogleSignInAccount(i7, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
            case 1:
                int d03 = com.bumptech.glide.c.d0(parcel);
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                Account account = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                int i10 = 0;
                boolean z8 = false;
                boolean z10 = false;
                boolean z11 = false;
                while (parcel.dataPosition() < d03) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i10 = com.bumptech.glide.c.Q(readInt2, parcel);
                            break;
                        case 2:
                            arrayList3 = com.bumptech.glide.c.v(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) com.bumptech.glide.c.q(parcel, readInt2, Account.CREATOR);
                            break;
                        case 4:
                            z8 = com.bumptech.glide.c.M(readInt2, parcel);
                            break;
                        case 5:
                            z10 = com.bumptech.glide.c.M(readInt2, parcel);
                            break;
                        case 6:
                            z11 = com.bumptech.glide.c.M(readInt2, parcel);
                            break;
                        case 7:
                            str9 = com.bumptech.glide.c.r(readInt2, parcel);
                            break;
                        case g.BYTES_FIELD_NUMBER /* 8 */:
                            str10 = com.bumptech.glide.c.r(readInt2, parcel);
                            break;
                        case '\t':
                            arrayList2 = com.bumptech.glide.c.v(parcel, readInt2, D5.a.CREATOR);
                            break;
                        case '\n':
                            str11 = com.bumptech.glide.c.r(readInt2, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt2, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d03, parcel);
                return new GoogleSignInOptions(i10, arrayList3, account, z8, z10, z11, str9, str10, GoogleSignInOptions.z(arrayList2), str11);
            default:
                int d04 = com.bumptech.glide.c.d0(parcel);
                String str12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String str13 = "";
                while (parcel.dataPosition() < d04) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 4) {
                        str12 = com.bumptech.glide.c.r(readInt3, parcel);
                    } else if (c10 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) com.bumptech.glide.c.q(parcel, readInt3, GoogleSignInAccount.CREATOR);
                    } else if (c10 != '\b') {
                        com.bumptech.glide.c.b0(readInt3, parcel);
                    } else {
                        str13 = com.bumptech.glide.c.r(readInt3, parcel);
                    }
                }
                com.bumptech.glide.c.y(d04, parcel);
                return new SignInAccount(str12, googleSignInAccount, str13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f2917a) {
            case 0:
                return new GoogleSignInAccount[i7];
            case 1:
                return new GoogleSignInOptions[i7];
            default:
                return new SignInAccount[i7];
        }
    }
}
