package com.kt.apps.core.base.leanback;

import A9.C0163z1;
import A9.N2;
import A9.O2;
import A9.P2;
import A9.Q2;
import A9.R2;
import A9.S2;
import A9.U2;
import A9.V2;
import A9.W2;
import Db.o;
import F1.a;
import android.animation.ValueAnimator;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.b;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;
import o.C1748n;
import x9.c;

/* loaded from: classes2.dex */
public final class SearchView extends FrameLayout implements View.OnClickListener {

    /* renamed from: H, reason: collision with root package name */
    public static final o f16055H = b.z(new C0163z1(3));

    /* renamed from: A, reason: collision with root package name */
    public String f16056A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f16057B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f16058C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f16059D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f16060E;

    /* renamed from: F, reason: collision with root package name */
    public final o f16061F;

    /* renamed from: G, reason: collision with root package name */
    public final S2 f16062G;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f16063a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f16064b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f16065c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16066d;

    /* renamed from: e, reason: collision with root package name */
    public U2 f16067e;

    /* renamed from: f, reason: collision with root package name */
    public final SearchAutoComplete f16068f;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f16069u;

    /* renamed from: v, reason: collision with root package name */
    public SearchableInfo f16070v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f16071w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f16072x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f16073y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f16074z;

    /* loaded from: classes2.dex */
    public static class SearchAutoComplete extends C1748n {

        /* renamed from: e, reason: collision with root package name */
        public int f16075e;

        /* renamed from: f, reason: collision with root package name */
        public SearchView f16076f;

        /* renamed from: u, reason: collision with root package name */
        public boolean f16077u;

        /* renamed from: v, reason: collision with root package name */
        public final S2 f16078v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            l.b(context);
            this.f16078v = new S2(this, 1);
            this.f16075e = getThreshold();
        }

        private final int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i7 >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i7 < 600) {
                return (i7 < 640 || i10 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            V2 v22 = (V2) SearchView.f16055H.getValue();
            v22.getClass();
            if (i7 >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
            Method method = v22.f992c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        public final boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f16075e <= 0 || super.enoughToFilter();
        }

        @Override // o.C1748n, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            l.e(editorInfo, "editorInfo");
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f16077u) {
                S2 s22 = this.f16078v;
                removeCallbacks(s22);
                post(s22);
            }
            l.b(onCreateInputConnection);
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z8, int i7, Rect rect) {
            super.onFocusChanged(z8, i7, rect);
            SearchView searchView = this.f16076f;
            l.b(searchView);
            searchView.h(searchView.f16059D);
            searchView.post(searchView.f16062G);
            SearchAutoComplete searchAutoComplete = searchView.f16068f;
            l.b(searchAutoComplete);
            if (searchAutoComplete.hasFocus()) {
                searchView.b();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i7, KeyEvent event) {
            ImageView imageView;
            l.e(event, "event");
            String message = "On Key PreIme: " + i7;
            l.e(message, "message");
            if (i7 == 4) {
                if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(event, this);
                    }
                    return true;
                }
                if (event.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(event);
                    }
                    if (event.isTracking() && !event.isCanceled()) {
                        SearchView searchView = this.f16076f;
                        if (searchView != null && (imageView = searchView.f16074z) != null) {
                            imageView.requestFocus();
                        }
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, event);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z8) {
            super.onWindowFocusChanged(z8);
            if (z8) {
                SearchView searchView = this.f16076f;
                l.b(searchView);
                if (searchView.hasFocus() && getVisibility() == 0) {
                    SearchView searchView2 = this.f16076f;
                    l.b(searchView2);
                    if (searchView2.getShowKeyBoardOnDefaultFocus()) {
                        this.f16077u = true;
                        o oVar = SearchView.f16055H;
                        Context context = getContext();
                        l.d(context, "getContext(...)");
                        if (context.getResources().getConfiguration().orientation == 2) {
                            a();
                        }
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence text) {
            l.e(text, "text");
        }

        public final void setImeVisibility(boolean z8) {
            Object systemService = getContext().getSystemService("input_method");
            l.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            S2 s22 = this.f16078v;
            if (!z8) {
                this.f16077u = false;
                removeCallbacks(s22);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f16077u = true;
                    return;
                }
                this.f16077u = false;
                removeCallbacks(s22);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public final void setSearchView(SearchView searchView) {
            this.f16076f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.f16075e = i7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attr) {
        super(context, attr, 0);
        int i7 = 0;
        l.e(context, "context");
        l.e(attr, "attr");
        this.f16061F = b.z(new N2(this, i7));
        O2 o22 = new O2(this, i7);
        W2 w22 = new W2(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(c.f26279b);
        l.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(24, R.layout.default_search_view), (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f16071w = imageView;
        this.f16072x = (ImageView) findViewById(R.id.search_go_btn);
        ImageView imageView2 = (ImageView) findViewById(R.id.search_close_btn);
        this.f16073y = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f16074z = imageView3;
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f16068f = searchAutoComplete;
        if (searchAutoComplete != null) {
            searchAutoComplete.setSearchView(this);
        }
        this.f16066d = context.getString(obtainStyledAttributes.getResourceId(26, R.string.search_query_hint_default));
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f16064b = intent;
        if (imageView3 != null) {
            imageView3.setOnClickListener(this);
        }
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent2.addFlags(268435456);
        this.f16065c = intent2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new P2(this, 0));
        imageView3.setOnFocusChangeListener(new Q2(0, ofFloat, this));
        l.b(searchAutoComplete);
        searchAutoComplete.addTextChangedListener(w22);
        searchAutoComplete.setOnEditorActionListener(getMOnEditorActionListener());
        searchAutoComplete.setOnKeyListener(o22);
        searchAutoComplete.setOnFocusChangeListener(new R2(this, 0));
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete2 = this.f16068f;
        if (searchAutoComplete2 != null) {
            searchAutoComplete2.setHint(queryHint);
        }
        obtainStyledAttributes.recycle();
        this.f16062G = new S2(this, 0);
    }

    private final TextView.OnEditorActionListener getMOnEditorActionListener() {
        return (TextView.OnEditorActionListener) this.f16061F.getValue();
    }

    public final Intent a(Intent intent, SearchableInfo searchableInfo) {
        String str;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
            l.d(str, "getString(...)");
        } else {
            str = "free_form";
        }
        String string = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string2 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", string);
        intent3.putExtra("android.speech.extra.LANGUAGE", string2);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void b() {
        int i7 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f16068f;
        if (i7 >= 29) {
            if (searchAutoComplete != null) {
                searchAutoComplete.refreshAutoCompleteResults();
                return;
            }
            return;
        }
        o oVar = f16055H;
        V2 v22 = (V2) oVar.getValue();
        v22.getClass();
        if (i7 >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
        Method method = v22.f990a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        V2 v23 = (V2) oVar.getValue();
        v23.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
        Method method2 = v23.f991b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void c(String str) {
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("user_query", this.f16069u);
        if (str != null) {
            intent.putExtra("query", str);
        }
        SearchableInfo searchableInfo = this.f16070v;
        l.b(searchableInfo);
        intent.setComponent(searchableInfo.getSearchActivity());
        getContext().startActivity(intent);
    }

    public final void d() {
        SearchAutoComplete searchAutoComplete = this.f16068f;
        l.b(searchAutoComplete);
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f16067e != null) {
            text.toString();
            return;
        }
        if (this.f16070v != null) {
            c(text.toString());
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void e(String str) {
        SearchAutoComplete searchAutoComplete = this.f16068f;
        if (searchAutoComplete != null) {
            searchAutoComplete.setText(str);
        }
        if (str != null) {
            l.b(searchAutoComplete);
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f16069u = str;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d();
    }

    public final void f() {
        SearchAutoComplete searchAutoComplete = this.f16068f;
        if (searchAutoComplete != null) {
            searchAutoComplete.a();
        }
        Object systemService = getContext().getSystemService("input_method");
        l.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(searchAutoComplete, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r5.getSelectionStart() == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        if (r5.getSelectionEnd() == r0.length()) goto L36;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i7) {
        String message = "Focus search: {focused: " + view + ", direction: " + i7 + "}";
        l.e(message, "message");
        ImageView imageView = this.f16074z;
        boolean a9 = l.a(view, imageView);
        ImageView imageView2 = this.f16073y;
        SearchAutoComplete searchAutoComplete = this.f16068f;
        if (a9 && i7 == 66) {
            return (searchAutoComplete == null || !searchAutoComplete.b()) ? imageView2 : searchAutoComplete;
        }
        if (l.a(view, searchAutoComplete)) {
            if (searchAutoComplete == null || !searchAutoComplete.b()) {
                l.b(searchAutoComplete);
            }
            if (i7 == 17 || i7 == 33) {
                return i7 == 33 ? imageView : super.focusSearch(view, i7);
            }
        }
        if (l.a(view, searchAutoComplete) && i7 == 66) {
            if (searchAutoComplete == null || !searchAutoComplete.b()) {
                if (searchAutoComplete != null && (r0 = searchAutoComplete.getText()) != null) {
                    l.b(searchAutoComplete);
                }
            }
            return imageView2;
        }
        return (l.a(view, imageView2) && (i7 == 33 || i7 == 17)) ? searchAutoComplete : super.focusSearch(view, i7);
    }

    public final void g() {
        SearchAutoComplete searchAutoComplete = this.f16068f;
        l.b(searchAutoComplete);
        boolean isEmpty = TextUtils.isEmpty(searchAutoComplete.getText());
        boolean z8 = !isEmpty || this.f16058C;
        ImageView imageView = this.f16073y;
        if (imageView != null) {
            imageView.setVisibility(z8 ? 0 : 8);
        }
        Drawable drawable = imageView != null ? imageView.getDrawable() : null;
        if (drawable != null) {
            drawable.setState(!isEmpty ? FrameLayout.ENABLED_STATE_SET : FrameLayout.EMPTY_STATE_SET);
        }
    }

    public final a getMSuggestionsAdapter() {
        return null;
    }

    public final CharSequence getQueryHint() {
        CharSequence charSequence = this.f16063a;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f16070v;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            String str = this.f16066d;
            l.b(str);
            return str;
        }
        Context context = getContext();
        SearchableInfo searchableInfo2 = this.f16070v;
        l.b(searchableInfo2);
        CharSequence text = context.getText(searchableInfo2.getHintId());
        l.b(text);
        return text;
    }

    public final SearchAutoComplete getSearchEdtAutoComplete() {
        return this.f16068f;
    }

    public final boolean getShowKeyBoardOnDefaultFocus() {
        return this.f16060E;
    }

    public final void h(boolean z8) {
        ImageView imageView;
        this.f16059D = z8;
        int i7 = z8 ? 0 : 8;
        SearchAutoComplete searchAutoComplete = this.f16068f;
        l.b(searchAutoComplete);
        TextUtils.isEmpty(searchAutoComplete.getText());
        ImageView imageView2 = this.f16071w;
        if (imageView2 != null) {
            imageView2.setVisibility(i7);
        }
        ImageView imageView3 = this.f16072x;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        g();
        if (!this.f16057B || this.f16059D) {
            return;
        }
        if ((imageView3 == null || imageView3.getVisibility() != 0) && (imageView = this.f16074z) != null) {
            imageView.getVisibility();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        l.e(v10, "v");
        SearchAutoComplete searchAutoComplete = this.f16068f;
        ImageView imageView = this.f16071w;
        if (v10 == imageView) {
            h(false);
            l.b(searchAutoComplete);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            if (imageView != null) {
                imageView.performClick();
                return;
            }
            return;
        }
        if (v10 == this.f16073y) {
            l.b(searchAutoComplete);
            Editable text = searchAutoComplete.getText();
            l.d(text, "getText(...)");
            if (!TextUtils.isEmpty(text)) {
                searchAutoComplete.setText("");
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                return;
            } else {
                if (this.f16058C) {
                    clearFocus();
                    h(true);
                    return;
                }
                return;
            }
        }
        if (v10 == this.f16072x) {
            d();
            return;
        }
        if (v10 != this.f16074z) {
            if (v10 == searchAutoComplete) {
                b();
            }
            return;
        }
        SearchableInfo searchableInfo = this.f16070v;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    Intent intent = this.f16064b;
                    l.b(intent);
                    SearchableInfo searchableInfo2 = this.f16070v;
                    l.b(searchableInfo2);
                    Intent intent2 = new Intent(intent);
                    ComponentName searchActivity = searchableInfo2.getSearchActivity();
                    intent2.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
                    getContext().startActivity(intent2);
                    return;
                }
                SearchableInfo searchableInfo3 = this.f16070v;
                l.b(searchableInfo3);
                if (searchableInfo3.getVoiceSearchLaunchRecognizer()) {
                    Intent intent3 = this.f16065c;
                    l.b(intent3);
                    SearchableInfo searchableInfo4 = this.f16070v;
                    l.b(searchableInfo4);
                    getContext().startActivity(a(intent3, searchableInfo4));
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public final void setIconifiedByDefault(boolean z8) {
        if (this.f16058C == z8) {
            return;
        }
        this.f16058C = z8;
        h(z8);
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f16068f;
        if (searchAutoComplete != null) {
            searchAutoComplete.setHint(queryHint);
        }
    }

    public final void setMSuggestionsAdapter(a aVar) {
    }

    public final void setOnQueryTextListener(U2 listener) {
        l.e(listener, "listener");
        this.f16067e = listener;
    }

    public final void setQueryHint(CharSequence value) {
        l.e(value, "value");
        SearchAutoComplete searchAutoComplete = this.f16068f;
        if (searchAutoComplete != null) {
            searchAutoComplete.setHint(value);
        }
        this.f16063a = value;
    }

    public final void setSearchableInfo(SearchableInfo searchable) {
        Intent intent;
        l.e(searchable, "searchable");
        this.f16070v = searchable;
        SearchAutoComplete searchAutoComplete = this.f16068f;
        l.b(searchAutoComplete);
        SearchableInfo searchableInfo = this.f16070v;
        l.b(searchableInfo);
        searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
        SearchableInfo searchableInfo2 = this.f16070v;
        l.b(searchableInfo2);
        searchAutoComplete.setImeOptions(searchableInfo2.getImeOptions());
        SearchableInfo searchableInfo3 = this.f16070v;
        l.b(searchableInfo3);
        int inputType = searchableInfo3.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            SearchableInfo searchableInfo4 = this.f16070v;
            l.b(searchableInfo4);
            if (searchableInfo4.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        searchAutoComplete.setInputType(inputType);
        SearchableInfo searchableInfo5 = this.f16070v;
        l.b(searchableInfo5);
        searchableInfo5.getSuggestAuthority();
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete2 = this.f16068f;
        if (searchAutoComplete2 != null) {
            searchAutoComplete2.setHint(queryHint);
        }
        SearchableInfo searchableInfo6 = this.f16070v;
        boolean z8 = false;
        if (searchableInfo6 != null && searchableInfo6.getVoiceSearchEnabled()) {
            SearchableInfo searchableInfo7 = this.f16070v;
            l.b(searchableInfo7);
            if (searchableInfo7.getVoiceSearchLaunchWebSearch()) {
                intent = this.f16064b;
            } else {
                SearchableInfo searchableInfo8 = this.f16070v;
                l.b(searchableInfo8);
                intent = searchableInfo8.getVoiceSearchLaunchRecognizer() ? this.f16065c : null;
            }
            if (intent != null) {
                z8 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f16057B = z8;
        if (z8) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        h(this.f16059D);
    }

    public final void setShowKeyBoardOnDefaultFocus(boolean z8) {
        this.f16060E = z8;
    }
}
