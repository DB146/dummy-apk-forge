package androidx.credentials.playservices;

import A1.d;
import D1.c;
import R5.a;
import R7.b;
import U5.C0556y;
import Y5.C0660y;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.C0981w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.p000authapi.zbaf;
import com.google.android.gms.internal.p000authapi.zbap;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.l;
import z5.r;
import z5.s;

/* loaded from: classes.dex */
public class HiddenActivity extends Activity {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13314c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f13315a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13316b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(f.API_PRIORITY_OTHER, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i7);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f13315a;
        if (resultReceiver != null) {
            resultReceiver.send(i10, bundle);
        }
        this.f13316b = false;
        finish();
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.common.api.l, T5.a] */
    /* JADX WARN: Type inference failed for: r4v9, types: [z5.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [z5.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [z5.s, java.lang.Object] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i7 = 2;
        final int i10 = 3;
        final int i11 = 1;
        super.onCreate(bundle);
        final int i12 = 0;
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f13315a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.f13316b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.f13316b) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        z5.f fVar = (z5.f) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((fVar != null ? new zbap((Activity) this, (s) new Object()).beginSignIn(fVar).addOnSuccessListener(new d(new c(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1), 0), 13)).addOnFailureListener(new OnFailureListener(this) { // from class: D1.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ HiddenActivity f3150b;

                            {
                                this.f3150b = this;
                            }

                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception e2) {
                                String str = "CREATE_UNKNOWN";
                                String str2 = "GET_NO_CREDENTIALS";
                                HiddenActivity this$0 = this.f3150b;
                                switch (i10) {
                                    case 0:
                                        int i13 = HiddenActivity.f13314c;
                                        l.e(this$0, "this$0");
                                        l.e(e2, "e");
                                        if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver2 = this$0.f13315a;
                                        l.b(resultReceiver2);
                                        this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e2.getMessage());
                                        return;
                                    case 1:
                                        int i14 = HiddenActivity.f13314c;
                                        l.e(this$0, "this$0");
                                        l.e(e2, "e");
                                        if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver3 = this$0.f13315a;
                                        l.b(resultReceiver3);
                                        this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e2.getMessage());
                                        return;
                                    case 2:
                                        int i15 = HiddenActivity.f13314c;
                                        l.e(this$0, "this$0");
                                        l.e(e2, "e");
                                        if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver4 = this$0.f13315a;
                                        l.b(resultReceiver4);
                                        this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e2.getMessage());
                                        return;
                                    default:
                                        int i16 = HiddenActivity.f13314c;
                                        l.e(this$0, "this$0");
                                        l.e(e2, "e");
                                        if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver5 = this$0.f13315a;
                                        l.b(resultReceiver5);
                                        this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e2.getMessage());
                                        return;
                                }
                            }
                        }) : null) == null) {
                            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        C0556y c0556y = (C0556y) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (c0556y != null) {
                            int i13 = a.f8921a;
                            com.google.android.gms.common.api.d dVar = e.f14901q;
                            C0660y c0660y = new C0660y(9);
                            Looper mainLooper = getMainLooper();
                            G.h(mainLooper, "Looper must not be null.");
                            ?? lVar = new com.google.android.gms.common.api.l(this, this, T5.a.f9318a, dVar, new k(c0660y, mainLooper));
                            C0981w builder = AbstractC0982x.builder();
                            builder.f15003a = new b((T5.a) lVar, c0556y);
                            builder.f15006d = 5407;
                            r6 = lVar.doRead(builder.a()).addOnSuccessListener(new d(new c(this, intExtra, 2), 10)).addOnFailureListener(new OnFailureListener(this) { // from class: D1.b

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f3150b;

                                {
                                    this.f3150b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception e2) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity this$0 = this.f3150b;
                                    switch (i12) {
                                        case 0:
                                            int i132 = HiddenActivity.f13314c;
                                            l.e(this$0, "this$0");
                                            l.e(e2, "e");
                                            if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = this$0.f13315a;
                                            l.b(resultReceiver2);
                                            this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e2.getMessage());
                                            return;
                                        case 1:
                                            int i14 = HiddenActivity.f13314c;
                                            l.e(this$0, "this$0");
                                            l.e(e2, "e");
                                            if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = this$0.f13315a;
                                            l.b(resultReceiver3);
                                            this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e2.getMessage());
                                            return;
                                        case 2:
                                            int i15 = HiddenActivity.f13314c;
                                            l.e(this$0, "this$0");
                                            l.e(e2, "e");
                                            if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = this$0.f13315a;
                                            l.b(resultReceiver4);
                                            this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e2.getMessage());
                                            return;
                                        default:
                                            int i16 = HiddenActivity.f13314c;
                                            l.e(this$0, "this$0");
                                            l.e(e2, "e");
                                            if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = this$0.f13315a;
                                            l.b(resultReceiver5);
                                            this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e2.getMessage());
                                            return;
                                    }
                                }
                            });
                        }
                        if (r6 == null) {
                            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        z5.l lVar2 = (z5.l) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((lVar2 != null ? new zbaf((Activity) this, (r) new Object()).savePassword(lVar2).addOnSuccessListener(new d(new c(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1), 1), 11)).addOnFailureListener(new OnFailureListener(this) { // from class: D1.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ HiddenActivity f3150b;

                            {
                                this.f3150b = this;
                            }

                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception e2) {
                                String str = "CREATE_UNKNOWN";
                                String str2 = "GET_NO_CREDENTIALS";
                                HiddenActivity this$0 = this.f3150b;
                                switch (i11) {
                                    case 0:
                                        int i132 = HiddenActivity.f13314c;
                                        l.e(this$0, "this$0");
                                        l.e(e2, "e");
                                        if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver2 = this$0.f13315a;
                                        l.b(resultReceiver2);
                                        this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e2.getMessage());
                                        return;
                                    case 1:
                                        int i14 = HiddenActivity.f13314c;
                                        l.e(this$0, "this$0");
                                        l.e(e2, "e");
                                        if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver3 = this$0.f13315a;
                                        l.b(resultReceiver3);
                                        this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e2.getMessage());
                                        return;
                                    case 2:
                                        int i15 = HiddenActivity.f13314c;
                                        l.e(this$0, "this$0");
                                        l.e(e2, "e");
                                        if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver4 = this$0.f13315a;
                                        l.b(resultReceiver4);
                                        this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e2.getMessage());
                                        return;
                                    default:
                                        int i16 = HiddenActivity.f13314c;
                                        l.e(this$0, "this$0");
                                        l.e(e2, "e");
                                        if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver5 = this$0.f13315a;
                                        l.b(resultReceiver5);
                                        this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e2.getMessage());
                                        return;
                                }
                            }
                        }) : null) == null) {
                            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        z5.j jVar = (z5.j) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((jVar != null ? new zbap((Activity) this, (s) new Object()).getSignInIntent(jVar).addOnSuccessListener(new d(new c(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1), 3), 12)).addOnFailureListener(new OnFailureListener(this) { // from class: D1.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ HiddenActivity f3150b;

                            {
                                this.f3150b = this;
                            }

                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception e2) {
                                String str = "CREATE_UNKNOWN";
                                String str2 = "GET_NO_CREDENTIALS";
                                HiddenActivity this$0 = this.f3150b;
                                switch (i7) {
                                    case 0:
                                        int i132 = HiddenActivity.f13314c;
                                        l.e(this$0, "this$0");
                                        l.e(e2, "e");
                                        if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver2 = this$0.f13315a;
                                        l.b(resultReceiver2);
                                        this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e2.getMessage());
                                        return;
                                    case 1:
                                        int i14 = HiddenActivity.f13314c;
                                        l.e(this$0, "this$0");
                                        l.e(e2, "e");
                                        if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver3 = this$0.f13315a;
                                        l.b(resultReceiver3);
                                        this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e2.getMessage());
                                        return;
                                    case 2:
                                        int i15 = HiddenActivity.f13314c;
                                        l.e(this$0, "this$0");
                                        l.e(e2, "e");
                                        if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver4 = this$0.f13315a;
                                        l.b(resultReceiver4);
                                        this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e2.getMessage());
                                        return;
                                    default:
                                        int i16 = HiddenActivity.f13314c;
                                        l.e(this$0, "this$0");
                                        l.e(e2, "e");
                                        if ((e2 instanceof j) && E1.a.f3516a.contains(Integer.valueOf(((j) e2).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver5 = this$0.f13315a;
                                        l.b(resultReceiver5);
                                        this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e2.getMessage());
                                        return;
                                }
                            }
                        }) : null) == null) {
                            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        l.e(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f13316b);
        super.onSaveInstanceState(outState);
    }
}
