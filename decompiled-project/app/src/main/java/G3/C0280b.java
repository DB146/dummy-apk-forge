package G3;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: G3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4293a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4294b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4295c;

    public /* synthetic */ C0280b(int i7, Object obj, Object obj2) {
        this.f4293a = i7;
        this.f4295c = obj;
        this.f4294b = obj2;
    }

    public C0280b(Context context, InterfaceC0285g interfaceC0285g) {
        this.f4293a = 1;
        this.f4295c = context.getApplicationContext();
        this.f4294b = interfaceC0285g;
    }

    public C0280b(Context context, s sVar) {
        this.f4293a = 4;
        this.f4295c = context.getApplicationContext();
        this.f4294b = sVar;
    }

    public C0280b(Resources resources, s sVar) {
        this.f4293a = 3;
        this.f4294b = resources;
        this.f4295c = sVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [G3.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, G3.a] */
    @Override // G3.s
    public final r a(Object obj, int i7, int i10, A3.l lVar) {
        r a9;
        Uri uri;
        switch (this.f4293a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new r(new V3.d(uri2), this.f4294b.f((AssetManager) this.f4295c, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) lVar.c(L3.c.f6286b);
                return new r(new V3.d(num), new C0284f(theme, theme != null ? theme.getResources() : ((Context) this.f4295c).getResources(), this.f4294b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f4295c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                A3.h hVar = null;
                for (int i11 = 0; i11 < size; i11++) {
                    s sVar = (s) arrayList.get(i11);
                    if (sVar.b(obj) && (a9 = sVar.a(obj, i7, i10, lVar)) != null) {
                        arrayList2.add(a9.f4329c);
                        hVar = a9.f4327a;
                    }
                }
                if (arrayList2.isEmpty() || hVar == null) {
                    return null;
                }
                return new r(hVar, new w(arrayList2, (Q7.h) this.f4294b));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources = (Resources) this.f4294b;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException e2) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e2);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((s) this.f4295c).a(uri, i7, i10, lVar);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size2 = pathSegments.size();
                s sVar2 = (s) this.f4294b;
                r rVar = null;
                if (size2 == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt != 0) {
                            rVar = sVar2.a(Integer.valueOf(parseInt), i7, i10, lVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return rVar;
                    } catch (NumberFormatException e10) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return rVar;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e10);
                        return rVar;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.f4295c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return sVar2.a(Integer.valueOf(identifier), i7, i10, lVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    @Override // G3.s
    public final boolean b(Object obj) {
        switch (this.f4293a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                Iterator it = ((ArrayList) this.f4295c).iterator();
                while (it.hasNext()) {
                    if (((s) it.next()).b(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f4295c).getPackageName().equals(uri2.getAuthority());
        }
    }

    public String toString() {
        switch (this.f4293a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f4295c).toArray()) + '}';
            default:
                return super.toString();
        }
    }
}
