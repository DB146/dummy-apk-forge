package S1;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements TextWatcher, SpanWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8977a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f8978b = new AtomicInteger(0);

    public c(Object obj) {
        this.f8977a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f8977a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        ((TextWatcher) this.f8977a).beforeTextChanged(charSequence, i7, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i7, int i10) {
        this.f8978b.get();
        ((SpanWatcher) this.f8977a).onSpanAdded(spannable, obj, i7, i10);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        this.f8978b.get();
        if (Build.VERSION.SDK_INT < 28) {
            if (i7 > i10) {
                i7 = 0;
            }
            if (i11 > i12) {
                i13 = i7;
                i14 = 0;
                ((SpanWatcher) this.f8977a).onSpanChanged(spannable, obj, i13, i10, i14, i12);
            }
        }
        i13 = i7;
        i14 = i11;
        ((SpanWatcher) this.f8977a).onSpanChanged(spannable, obj, i13, i10, i14, i12);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i7, int i10) {
        this.f8978b.get();
        ((SpanWatcher) this.f8977a).onSpanRemoved(spannable, obj, i7, i10);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        ((TextWatcher) this.f8977a).onTextChanged(charSequence, i7, i10, i11);
    }
}
