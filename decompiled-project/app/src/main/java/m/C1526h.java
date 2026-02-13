package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import h.AbstractC1213a;
import java.io.IOException;
import l2.X;
import n.ActionProviderVisibilityListenerC1681o;
import n.MenuC1678l;
import o.AbstractC1737h0;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1526h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f19665e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f19666f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f19667a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f19668b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f19669c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19670d;

    static {
        Class[] clsArr = {Context.class};
        f19665e = clsArr;
        f19666f = clsArr;
    }

    public C1526h(Context context) {
        super(context);
        this.f19669c = context;
        Object[] objArr = {context};
        this.f19667a = objArr;
        this.f19668b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v59 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r42;
        int i7;
        boolean z8;
        ColorStateList colorStateList;
        C1525g c1525g = new C1525g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            i7 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == r42) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i7) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z11 && name2.equals(str)) {
                        z8 = r42;
                        z11 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r42 = z8;
                        i7 = 2;
                        z11 = z11;
                    } else if (name2.equals("group")) {
                        c1525g.f19643b = 0;
                        c1525g.f19644c = 0;
                        c1525g.f19645d = 0;
                        c1525g.f19646e = 0;
                        c1525g.f19647f = r42;
                        c1525g.g = r42;
                    } else if (name2.equals("item")) {
                        if (!c1525g.f19648h) {
                            ActionProviderVisibilityListenerC1681o actionProviderVisibilityListenerC1681o = c1525g.f19664z;
                            if (actionProviderVisibilityListenerC1681o == null || !actionProviderVisibilityListenerC1681o.f20998b.hasSubMenu()) {
                                c1525g.f19648h = r42;
                                c1525g.b(c1525g.f19642a.add(c1525g.f19643b, c1525g.f19649i, c1525g.j, c1525g.k));
                            } else {
                                c1525g.f19648h = r42;
                                c1525g.b(c1525g.f19642a.addSubMenu(c1525g.f19643b, c1525g.f19649i, c1525g.j, c1525g.k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z8 = r42;
                        z10 = z8;
                    }
                }
                z8 = r42;
            } else {
                if (!z11) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C1526h c1526h = c1525g.f19641E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c1526h.f19669c.obtainStyledAttributes(attributeSet, AbstractC1213a.f17578p);
                        c1525g.f19643b = obtainStyledAttributes.getResourceId(r42, 0);
                        c1525g.f19644c = obtainStyledAttributes.getInt(3, 0);
                        c1525g.f19645d = obtainStyledAttributes.getInt(4, 0);
                        c1525g.f19646e = obtainStyledAttributes.getInt(5, 0);
                        c1525g.f19647f = obtainStyledAttributes.getBoolean(2, r42);
                        c1525g.g = obtainStyledAttributes.getBoolean(0, r42);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            X t5 = X.t(c1526h.f19669c, attributeSet, AbstractC1213a.f17579q);
                            TypedArray typedArray = (TypedArray) t5.f19195c;
                            c1525g.f19649i = typedArray.getResourceId(2, 0);
                            c1525g.j = (typedArray.getInt(5, c1525g.f19644c) & (-65536)) | (typedArray.getInt(6, c1525g.f19645d) & 65535);
                            c1525g.k = typedArray.getText(7);
                            c1525g.f19650l = typedArray.getText(8);
                            c1525g.f19651m = typedArray.getResourceId(0, 0);
                            String string = typedArray.getString(9);
                            c1525g.f19652n = string == null ? (char) 0 : string.charAt(0);
                            c1525g.f19653o = typedArray.getInt(16, 4096);
                            String string2 = typedArray.getString(10);
                            c1525g.f19654p = string2 == null ? (char) 0 : string2.charAt(0);
                            c1525g.f19655q = typedArray.getInt(20, 4096);
                            if (typedArray.hasValue(11)) {
                                c1525g.f19656r = typedArray.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c1525g.f19656r = c1525g.f19646e;
                            }
                            c1525g.f19657s = typedArray.getBoolean(3, false);
                            c1525g.f19658t = typedArray.getBoolean(4, c1525g.f19647f);
                            c1525g.f19659u = typedArray.getBoolean(1, c1525g.g);
                            c1525g.f19660v = typedArray.getInt(21, -1);
                            c1525g.f19663y = typedArray.getString(12);
                            c1525g.f19661w = typedArray.getResourceId(13, 0);
                            c1525g.f19662x = typedArray.getString(15);
                            String string3 = typedArray.getString(14);
                            boolean z12 = string3 != null;
                            if (z12 && c1525g.f19661w == 0 && c1525g.f19662x == null) {
                                c1525g.f19664z = (ActionProviderVisibilityListenerC1681o) c1525g.a(string3, f19666f, c1526h.f19668b);
                            } else {
                                if (z12) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c1525g.f19664z = null;
                            }
                            c1525g.f19637A = typedArray.getText(17);
                            c1525g.f19638B = typedArray.getText(22);
                            if (typedArray.hasValue(19)) {
                                c1525g.f19640D = AbstractC1737h0.c(typedArray.getInt(19, -1), c1525g.f19640D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                c1525g.f19640D = null;
                            }
                            if (typedArray.hasValue(18)) {
                                c1525g.f19639C = t5.m(18);
                            } else {
                                c1525g.f19639C = colorStateList;
                            }
                            t5.w();
                            c1525g.f19648h = false;
                            z8 = true;
                        } else if (name3.equals("menu")) {
                            z8 = true;
                            c1525g.f19648h = true;
                            SubMenu addSubMenu = c1525g.f19642a.addSubMenu(c1525g.f19643b, c1525g.f19649i, c1525g.j, c1525g.k);
                            c1525g.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z8 = true;
                            str = name3;
                            z11 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r42 = z8;
                        i7 = 2;
                        z11 = z11;
                    }
                }
                z8 = r42;
            }
            eventType = xmlResourceParser.next();
            r42 = z8;
            i7 = 2;
            z11 = z11;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i7, Menu menu) {
        if (!(menu instanceof MenuC1678l)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z8 = false;
        try {
            try {
                xmlResourceParser = this.f19669c.getResources().getLayout(i7);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC1678l) {
                    MenuC1678l menuC1678l = (MenuC1678l) menu;
                    if (!menuC1678l.f20946D) {
                        menuC1678l.w();
                        z8 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z8) {
                    ((MenuC1678l) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th) {
            if (z8) {
                ((MenuC1678l) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
