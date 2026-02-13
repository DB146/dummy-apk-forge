package androidx.preference;

import A2.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.common.api.f;
import com.kt.apps.media.xemtv.beta.R;
import n1.b;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13569a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13570b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f13571c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f13572d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13573e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f13574f;

    /* renamed from: u, reason: collision with root package name */
    public a f13575u;

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i7) {
        this.f13570b = f.API_PRIORITY_OTHER;
        this.f13569a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A2.b.f339f, i7, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f13573e = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f13571c = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f13572d = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f13570b = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, f.API_PRIORITY_OTHER));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z8 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        b.d(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z8));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z8));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f13574f = d(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f13574f = d(obtainStyledAttributes, 11);
        }
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        a aVar = this.f13575u;
        return aVar != null ? aVar.j(this) : this.f13572d;
    }

    public void b() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i7 = preference2.f13570b;
        int i10 = this.f13570b;
        if (i10 != i7) {
            return i10 - i7;
        }
        CharSequence charSequence = preference2.f13571c;
        CharSequence charSequence2 = this.f13571c;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public Object d(TypedArray typedArray, int i7) {
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequence = this.f13571c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb2.append(charSequence);
            sb2.append(' ');
        }
        CharSequence a9 = a();
        if (!TextUtils.isEmpty(a9)) {
            sb2.append(a9);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }
}
