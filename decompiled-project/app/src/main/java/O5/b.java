package O5;

import A0.C;
import A0.C0020i;
import A0.C0021j;
import A0.InterfaceC0022k;
import B0.AbstractC0207v0;
import Eb.B;
import Eb.n;
import Fb.f;
import M9.d;
import Q.C0480b;
import Q.C0505n0;
import Q.C0506o;
import Q.InterfaceC0493h0;
import Rb.e;
import Zb.h;
import android.content.Context;
import android.text.TextUtils;
import android.transition.Transition;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import c0.m;
import c2.i;
import cc.C0955v;
import cc.F;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import h3.o;
import h5.g;
import hc.t;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import n5.v;
import q3.j;
import q3.p;
import v2.C2128B;
import v2.C2133e;
import v2.z;
import y9.AbstractC2456A;
import y9.M;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f7475a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f7476b;

    public static LinkedHashSet C(Set set, C2133e c2133e) {
        l.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(B.F(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(c2133e);
        return linkedHashSet;
    }

    public static long D(v vVar, int i7, int i10) {
        vVar.G(i7);
        if (vVar.a() < 5) {
            return -9223372036854775807L;
        }
        int h10 = vVar.h();
        if ((8388608 & h10) != 0 || ((2096896 & h10) >> 8) != i10 || (h10 & 32) == 0 || vVar.v() < 7 || vVar.a() < 7 || (vVar.v() & 16) != 16) {
            return -9223372036854775807L;
        }
        vVar.f(0, new byte[6], 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 K0.F, still in use, count: 2, list:
          (r2v0 K0.F) from 0x00e1: MOVE (r28v0 K0.F) = (r2v0 K0.F)
          (r2v0 K0.F) from 0x0090: MOVE (r28v2 K0.F) = (r2v0 K0.F)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final K0.F E(K0.F r29, V0.l r30) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.b.E(K0.F, V0.l):K0.F");
    }

    public static g F(g gVar, String[] strArr, Map map) {
        int i7 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i7 < length) {
                    gVar2.a((g) map.get(strArr[i7]));
                    i7++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i7 < length2) {
                    gVar.a((g) map.get(strArr[i7]));
                    i7++;
                }
            }
        }
        return gVar;
    }

    public static int G(float f4) {
        return (int) (f4 + (f4 < 0.0f ? -0.5f : 0.5f));
    }

    public static final void H(R9.a aVar, d config) {
        l.e(aVar, "<this>");
        l.e(config, "config");
        R9.b bVar = (R9.b) aVar;
        bVar.b(Long.valueOf(System.currentTimeMillis()), o.p(new StringBuilder(), config.f6851b, "_last_refresh_data"));
    }

    public static final Object I(t tVar, t tVar2, e eVar) {
        Object c0955v;
        Object K10;
        try {
            y.b(2, eVar);
            c0955v = eVar.invoke(tVar2, tVar);
        } catch (Throwable th) {
            c0955v = new C0955v(false, th);
        }
        Ib.a aVar = Ib.a.f5345a;
        if (c0955v == aVar || (K10 = tVar.K(c0955v)) == F.f14475e) {
            return aVar;
        }
        if (K10 instanceof C0955v) {
            throw ((C0955v) K10).f14583a;
        }
        return F.I(K10);
    }

    public static int J(int[] iArr) {
        int i7 = 0;
        for (int i10 : iArr) {
            i7 += i10;
        }
        return i7;
    }

    public static Status K(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, null, null, null);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && (str2 = split[1]) != null) {
            split[1] = str2.trim();
        }
        List asList = Arrays.asList(split);
        return asList.size() > 1 ? L((String) asList.get(0), (String) asList.get(1)) : L((String) asList.get(0), null);
    }

    public static Status L(String str, String str2) {
        int i7;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    c10 = 1;
                    break;
                }
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    c10 = 2;
                    break;
                }
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    c10 = 3;
                    break;
                }
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -1584641425:
                if (str.equals("UNAUTHORIZED_DOMAIN")) {
                    c10 = 11;
                    break;
                }
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    c10 = 14;
                    break;
                }
                break;
            case -1368998244:
                if (str.equals("INVALID_HOSTING_LINK_DOMAIN")) {
                    c10 = 15;
                    break;
                }
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    c10 = 16;
                    break;
                }
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    c10 = 17;
                    break;
                }
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    c10 = 18;
                    break;
                }
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    c10 = 19;
                    break;
                }
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    c10 = 20;
                    break;
                }
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    c10 = 21;
                    break;
                }
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    c10 = 22;
                    break;
                }
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    c10 = 23;
                    break;
                }
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    c10 = 24;
                    break;
                }
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    c10 = 25;
                    break;
                }
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    c10 = 26;
                    break;
                }
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    c10 = 27;
                    break;
                }
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    c10 = 28;
                    break;
                }
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    c10 = 29;
                    break;
                }
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    c10 = 30;
                    break;
                }
                break;
            case -406804866:
                if (str.equals("INVALID_LOGIN_CREDENTIALS")) {
                    c10 = 31;
                    break;
                }
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    c10 = ' ';
                    break;
                }
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    c10 = '!';
                    break;
                }
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    c10 = '\"';
                    break;
                }
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    c10 = '#';
                    break;
                }
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    c10 = '$';
                    break;
                }
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    c10 = '%';
                    break;
                }
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    c10 = '&';
                    break;
                }
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    c10 = '(';
                    break;
                }
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    c10 = ')';
                    break;
                }
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    c10 = '*';
                    break;
                }
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    c10 = '+';
                    break;
                }
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    c10 = ',';
                    break;
                }
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    c10 = '-';
                    break;
                }
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    c10 = '.';
                    break;
                }
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    c10 = '/';
                    break;
                }
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    c10 = '0';
                    break;
                }
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    c10 = '1';
                    break;
                }
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    c10 = '2';
                    break;
                }
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    c10 = '3';
                    break;
                }
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    c10 = '4';
                    break;
                }
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    c10 = '5';
                    break;
                }
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    c10 = '6';
                    break;
                }
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    c10 = '7';
                    break;
                }
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    c10 = '8';
                    break;
                }
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    c10 = '9';
                    break;
                }
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    c10 = ':';
                    break;
                }
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    c10 = ';';
                    break;
                }
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    c10 = '<';
                    break;
                }
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    c10 = '=';
                    break;
                }
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    c10 = '>';
                    break;
                }
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    c10 = '?';
                    break;
                }
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    c10 = '@';
                    break;
                }
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    c10 = 'L';
                    break;
                }
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    c10 = 'M';
                    break;
                }
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    c10 = 'P';
                    break;
                }
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    c10 = 'Q';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i7 = 18001;
                break;
            case 1:
                i7 = 17033;
                break;
            case 2:
                i7 = 17057;
                break;
            case 3:
                i7 = 17091;
                break;
            case 4:
            case 31:
            case '@':
                i7 = 17004;
                break;
            case 5:
                i7 = 17068;
                break;
            case 6:
                i7 = 17052;
                break;
            case 7:
                i7 = 17061;
                break;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                i7 = 17206;
                break;
            case '\t':
                i7 = 17200;
                break;
            case '\n':
                i7 = 17029;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                i7 = 17038;
                break;
            case '\f':
                i7 = 17030;
                break;
            case '\r':
                i7 = 17034;
                break;
            case 14:
                i7 = 17044;
                break;
            case 15:
                i7 = 17214;
                break;
            case 16:
                i7 = 17021;
                break;
            case 17:
                i7 = 17079;
                break;
            case 18:
                i7 = 18002;
                break;
            case 19:
                i7 = 17046;
                break;
            case 20:
                i7 = 17087;
                break;
            case 21:
            case 'I':
                i7 = 17008;
                break;
            case 22:
                i7 = 17085;
                break;
            case 23:
                i7 = 17094;
                break;
            case 24:
                i7 = 17064;
                break;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                i7 = 17016;
                break;
            case 26:
                i7 = 17084;
                break;
            case 27:
                i7 = 17035;
                break;
            case 28:
                i7 = 17014;
                break;
            case 29:
            case 'C':
                i7 = 17020;
                break;
            case 30:
                i7 = 17207;
                break;
            case ' ':
                i7 = 17203;
                break;
            case '!':
            case '4':
                i7 = 17006;
                break;
            case '\"':
                i7 = 17062;
                break;
            case '#':
                i7 = 17088;
                break;
            case '$':
                i7 = 17082;
                break;
            case '%':
            case '(':
                i7 = 17011;
                break;
            case '&':
                i7 = 17056;
                break;
            case '\'':
                i7 = 17026;
                break;
            case ')':
                i7 = 17089;
                break;
            case '*':
                i7 = 17032;
                break;
            case '+':
                i7 = 17041;
                break;
            case ',':
                i7 = 17074;
                break;
            case '-':
                i7 = 17081;
                break;
            case '.':
                i7 = 17095;
                break;
            case '/':
                i7 = 17007;
                break;
            case '0':
                i7 = 17017;
                break;
            case '1':
                i7 = 17065;
                break;
            case '2':
                i7 = 17204;
                break;
            case '3':
                i7 = 17205;
                break;
            case '5':
                i7 = 17086;
                break;
            case '6':
                i7 = 17075;
                break;
            case '7':
                i7 = 17083;
                break;
            case '8':
                i7 = 17049;
                break;
            case '9':
                i7 = 17071;
                break;
            case ':':
                i7 = 17002;
                break;
            case ';':
                i7 = 17058;
                break;
            case '<':
                i7 = 17078;
                break;
            case '=':
                i7 = 17093;
                break;
            case '>':
                i7 = 17031;
                break;
            case '?':
            case 'M':
                i7 = 17010;
                break;
            case 'A':
                i7 = 17000;
                break;
            case 'B':
                i7 = 17009;
                break;
            case 'D':
                i7 = 17202;
                break;
            case 'E':
                i7 = 17051;
                break;
            case 'F':
                i7 = 17043;
                break;
            case 'G':
                i7 = 17025;
                break;
            case 'H':
                i7 = 17201;
                break;
            case 'J':
                i7 = 17005;
                break;
            case 'K':
                i7 = 17042;
                break;
            case 'L':
                i7 = 17028;
                break;
            case 'N':
                i7 = 17040;
                break;
            case 'O':
                i7 = 17045;
                break;
            case 'P':
                i7 = 17090;
                break;
            case 'Q':
                i7 = 17073;
                break;
            default:
                i7 = 17499;
                break;
        }
        return i7 == 17499 ? str2 != null ? new Status(i7, X.c.i(str, ":", str2), null, null) : new Status(i7, str, null, null) : new Status(i7, str2, null, null);
    }

    public static final void a(String str, m mVar, K0.F f4, int i7, boolean z8, int i10, int i11, C0506o c0506o, int i12) {
        int i13;
        c0506o.U(-1040751001);
        if ((i12 & 6) == 0) {
            i13 = (c0506o.g(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= c0506o.g(mVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= c0506o.g(f4) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= c0506o.i(null) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= c0506o.e(i7) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= c0506o.h(z8) ? 131072 : 65536;
        }
        if ((1572864 & i12) == 0) {
            i13 |= c0506o.e(i10) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= c0506o.e(i11) ? 8388608 : 4194304;
        }
        if ((100663296 & i12) == 0) {
            i13 |= c0506o.i(null) ? 67108864 : 33554432;
        }
        int i14 = i13 | 805306368;
        if (c0506o.K(i14 & 1, (306783379 & i14) != 306783378)) {
            if (i11 <= 0 || i10 <= 0) {
                B.a.a("both minLines " + i11 + " and maxLines " + i10 + " must be greater than zero");
            }
            if (i11 > i10) {
                B.a.a("minLines " + i11 + " must be less than or equal to maxLines " + i10);
            }
            if (c0506o.k(K.b.f5827a) != null) {
                throw new ClassCastException();
            }
            c0506o.S(-1588311278);
            c0506o.p(false);
            c0506o.S(-1587511974);
            m c10 = mVar.c(new TextStringSimpleElement(str, f4, (N0.d) c0506o.k(AbstractC0207v0.k), i7, z8, i10, i11));
            c0506o.p(false);
            I.c cVar = I.c.f4954a;
            int i15 = c0506o.f8449P;
            m c11 = c0.o.c(c0506o, c10);
            InterfaceC0493h0 m10 = c0506o.m();
            InterfaceC0022k.g.getClass();
            C c12 = C0021j.f241b;
            c0506o.W();
            if (c0506o.f8448O) {
                c0506o.l(c12);
            } else {
                c0506o.g0();
            }
            C0480b.s(c0506o, C0021j.f244e, cVar);
            C0480b.s(c0506o, C0021j.f243d, m10);
            C0480b.s(c0506o, C0021j.f242c, c11);
            C0020i c0020i = C0021j.f245f;
            if (c0506o.f8448O || !l.a(c0506o.H(), Integer.valueOf(i15))) {
                c0506o.d0(Integer.valueOf(i15));
                c0506o.c(Integer.valueOf(i15), c0020i);
            }
            c0506o.p(true);
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new I.a(str, mVar, f4, i7, z8, i10, i11, i12, 0);
        }
    }

    public static final void b(String str, m mVar, K0.F f4, int i7, boolean z8, int i10, int i11, C0506o c0506o, int i12) {
        int i13;
        c0506o.U(-1186827822);
        if ((i12 & 6) == 0) {
            i13 = (c0506o.g(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= c0506o.g(mVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= c0506o.g(f4) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= c0506o.i(null) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= c0506o.e(i7) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= c0506o.h(z8) ? 131072 : 65536;
        }
        if ((1572864 & i12) == 0) {
            i13 |= c0506o.e(i10) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= c0506o.e(i11) ? 8388608 : 4194304;
        }
        int i14 = i13 | 100663296;
        if (c0506o.K(i14 & 1, (38347923 & i14) != 38347922)) {
            a(str, mVar, f4, i7, z8, i10, i11, c0506o, i14 & 268435454);
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new I.a(str, mVar, f4, i7, z8, i10, i11, i12, 1);
        }
    }

    public static final void c(boolean z8, e eVar, C0506o c0506o, int i7) {
        c0506o.U(1818896922);
        int i10 = (c0506o.h(z8) ? 4 : 2) | i7 | (c0506o.i(eVar) ? 32 : 16);
        if ((i10 & 19) == 18 && c0506o.x()) {
            c0506o.N();
        } else {
            i.c(z8, eVar, c0506o, i10 & 126);
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new Ha.a(z8, eVar, i7, 1);
        }
    }

    public static final Object[] d(Object[] objArr, int i7, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        n.R(objArr, 0, objArr2, i7, 6);
        n.P(objArr, i7 + 2, objArr2, i7, objArr.length);
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] e(int i7, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        n.R(objArr, 0, objArr2, i7, 6);
        n.P(objArr, i7, objArr2, i7 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] f(int i7, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        n.R(objArr, 0, objArr2, i7, 6);
        n.P(objArr, i7, objArr2, i7 + 1, objArr.length);
        return objArr2;
    }

    public static Fb.i i(Fb.i iVar) {
        f fVar = iVar.f4216a;
        fVar.b();
        return fVar.f4207w > 0 ? iVar : Fb.i.f4215b;
    }

    public static int j(int i7, int i10, int i11) {
        return i7 < i10 ? i10 : i7 > i11 ? i11 : i7;
    }

    public static int k(int i7, int i10) {
        int i11 = i7 - i10;
        if (i11 > i10) {
            i11 = i10;
            i10 = i11;
        }
        int i12 = 1;
        int i13 = 1;
        while (i7 > i10) {
            i12 *= i7;
            if (i13 <= i11) {
                i12 /= i13;
                i13++;
            }
            i7--;
        }
        while (i13 <= i11) {
            i12 /= i13;
            i13++;
        }
        return i12;
    }

    public static float l(float f4, float f10, float f11, float f12) {
        double d10 = f4 - f11;
        double d11 = f10 - f12;
        return (float) Math.sqrt((d11 * d11) + (d10 * d10));
    }

    public static float m(int i7, int i10, int i11, int i12) {
        double d10 = i7 - i11;
        double d11 = i10 - i12;
        return (float) Math.sqrt((d11 * d11) + (d10 * d10));
    }

    public static int n(int i7, int i10, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i7 / i10;
        int i12 = i7 - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i7 ^ i10) >> 31) | 1;
        switch (P6.b.f8164a[roundingMode.ordinal()]) {
            case 1:
                if (i12 == 0) {
                    return i11;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i13 <= 0) {
                    return i11;
                }
                break;
            case 6:
            case 7:
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                int abs = Math.abs(i12);
                int abs2 = abs - (Math.abs(i10) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i11 & 1) != 0))) {
                            return i11;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i11 + i13;
    }

    public static boolean o(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static final j p(p pVar) {
        l.e(pVar, "<this>");
        return new j(pVar.f23403a, pVar.f23419t);
    }

    public static M q() {
        return (M) AbstractC2456A.f27431h2.getValue();
    }

    public static final long r(R9.a aVar, d config) {
        l.e(aVar, "<this>");
        l.e(config, "config");
        try {
            return ((Number) ((R9.b) aVar).a(Long.TYPE, config.f6851b + "_last_refresh_data")).longValue();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String s(Class cls) {
        LinkedHashMap linkedHashMap = C2128B.f24961b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            z zVar = (z) cls.getAnnotation(z.class);
            str = zVar != null ? zVar.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, str);
        }
        l.b(str);
        return str;
    }

    public static int t(int[] iArr, int i7, boolean z8) {
        int[] iArr2 = iArr;
        int i10 = 0;
        for (int i11 : iArr2) {
            i10 += i11;
        }
        int length = iArr2.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = length - 1;
            if (i12 >= i15) {
                return i13;
            }
            int i16 = 1 << i12;
            i14 |= i16;
            int i17 = 1;
            while (i17 < iArr2[i12]) {
                int i18 = i10 - i17;
                int i19 = length - i12;
                int i20 = i19 - 2;
                int k = k(i18 - 1, i20);
                if (z8 && i14 == 0) {
                    int i21 = i19 - 1;
                    if (i18 - i21 >= i21) {
                        k -= k(i18 - i19, i20);
                    }
                }
                if (i19 - 1 > 1) {
                    int i22 = 0;
                    for (int i23 = i18 - i20; i23 > i7; i23--) {
                        i22 += k((i18 - i23) - 1, i19 - 3);
                    }
                    k -= (i15 - i12) * i22;
                } else if (i18 > i7) {
                    k--;
                }
                i13 += k;
                i17++;
                i14 &= ~i16;
                iArr2 = iArr;
            }
            i10 -= i17;
            i12++;
            iArr2 = iArr;
        }
    }

    public static final int u(int i7, int i10) {
        return (i7 >> i10) & 31;
    }

    public static synchronized boolean v(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f7475a;
            if (context2 != null && (bool = f7476b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f7476b = null;
            if (M5.c.f()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f7476b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f7476b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f7476b = Boolean.FALSE;
                }
            }
            f7475a = applicationContext;
            return f7476b.booleanValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Hb.d, Zb.h, java.lang.Object] */
    public static h w(e eVar) {
        ?? obj = new Object();
        obj.f12351d = com.bumptech.glide.c.m(obj, obj, eVar);
        return obj;
    }

    public static int x(int i7, RoundingMode roundingMode) {
        if (i7 <= 0) {
            throw new IllegalArgumentException(A3.c.f(i7, "x (", ") must be > 0"));
        }
        switch (P6.b.f8164a[roundingMode.ordinal()]) {
            case 1:
                if (!((i7 > 0) & (((i7 + (-1)) & i7) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i7 - 1);
            case 6:
            case 7:
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i7);
                return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i7))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i7);
    }

    public static int y(int i7) {
        int i10 = i7 % 65536;
        return i10 >= 0 ? i10 : i10 + 65536;
    }

    public void A(Transition transition) {
    }

    public void B() {
    }

    public abstract boolean g(Object obj, Object obj2);

    public abstract boolean h(Object obj, Object obj2);

    public void z() {
    }
}
