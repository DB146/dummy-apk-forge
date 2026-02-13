package d0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* loaded from: classes.dex */
public final class g extends AutofillManager$AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final g f16308a = new AutofillManager$AutofillCallback();

    public final void onAutofillEvent(View view, int i7, int i10) {
        super.onAutofillEvent(view, i7, i10);
        Log.d("Autofill Status", i10 != 1 ? i10 != 2 ? i10 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
