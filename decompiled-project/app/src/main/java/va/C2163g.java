package va;

import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.kt.apps.media.xemtv.beta.R;
import java.util.List;
import java.util.ListIterator;

/* renamed from: va.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2163g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f25329a;

    public C2163g(View view) {
        this.f25329a = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        String str;
        List<String> pathSegments = Uri.parse(String.valueOf(charSequence)).getPathSegments();
        kotlin.jvm.internal.l.d(pathSegments, "getPathSegments(...)");
        ListIterator<String> listIterator = pathSegments.listIterator(pathSegments.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                str = null;
                break;
            }
            str = listIterator.previous();
            String str2 = str;
            kotlin.jvm.internal.l.b(str2);
            if (ac.g.v0(str2).toString().length() > 0) {
                break;
            }
        }
        String str3 = str;
        View view = this.f25329a;
        if (str3 != null) {
            ((TextInputLayout) view.findViewById(R.id.textInputLayout)).setHint(str3);
        } else {
            ((TextInputLayout) view.findViewById(R.id.textInputLayout)).setHint("Tên nguồn");
        }
    }
}
