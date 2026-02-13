package S1;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Class f8979a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8980b;

    public d(Class cls, d dVar, int i7, int i10) {
        super(dVar, i7, i10);
        this.f8980b = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f8979a = cls;
    }

    public d(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f8980b = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f8979a = cls;
    }

    public final c a(Object obj) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f8980b;
            if (i7 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i7);
            if (cVar.f8977a == obj) {
                return cVar;
            }
            i7++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i7, int i10) {
        super.append(charSequence, i7, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i7, int i10) {
        super.append(charSequence, i7, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i7) {
        super.append(charSequence, obj, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i10) {
        super.append(charSequence, i7, i10);
        return this;
    }

    public final boolean b(Object obj) {
        if (obj != null) {
            if (this.f8979a == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i7, int i10) {
        super.delete(i7, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i7, int i10) {
        super.delete(i7, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        c a9;
        if (b(obj) && (a9 = a(obj)) != null) {
            obj = a9;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        c a9;
        if (b(obj) && (a9 = a(obj)) != null) {
            obj = a9;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        c a9;
        if (b(obj) && (a9 = a(obj)) != null) {
            obj = a9;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i7, int i10, Class cls) {
        if (this.f8979a != cls) {
            return super.getSpans(i7, i10, cls);
        }
        c[] cVarArr = (c[]) super.getSpans(i7, i10, c.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, cVarArr.length);
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            objArr[i11] = cVarArr[i11].f8977a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i7, CharSequence charSequence, int i10, int i11) {
        super.insert(i7, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence, int i10, int i11) {
        super.insert(i7, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i7, int i10, Class cls) {
        if (cls == null || this.f8979a == cls) {
            cls = c.class;
        }
        return super.nextSpanTransition(i7, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        c cVar;
        if (b(obj)) {
            cVar = a(obj);
            if (cVar != null) {
                obj = cVar;
            }
        } else {
            cVar = null;
        }
        super.removeSpan(obj);
        if (cVar != null) {
            this.f8980b.remove(cVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i10, CharSequence charSequence) {
        replace(i7, i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i7, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i10, CharSequence charSequence) {
        ArrayList arrayList;
        int i11 = 0;
        while (true) {
            arrayList = this.f8980b;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((c) arrayList.get(i11)).f8978b.incrementAndGet();
            i11++;
        }
        super.replace(i7, i10, charSequence);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((c) arrayList.get(i12)).f8978b.decrementAndGet();
        }
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i10, CharSequence charSequence, int i11, int i12) {
        ArrayList arrayList;
        int i13 = 0;
        while (true) {
            arrayList = this.f8980b;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((c) arrayList.get(i13)).f8978b.incrementAndGet();
            i13++;
        }
        super.replace(i7, i10, charSequence, i11, i12);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((c) arrayList.get(i14)).f8978b.decrementAndGet();
        }
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i7, int i10, int i11) {
        if (b(obj)) {
            c cVar = new c(obj);
            this.f8980b.add(cVar);
            obj = cVar;
        }
        super.setSpan(obj, i7, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i10) {
        return new d(this.f8979a, this, i7, i10);
    }
}
