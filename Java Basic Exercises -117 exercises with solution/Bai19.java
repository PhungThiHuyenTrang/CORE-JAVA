<!DOCTYPE html>
<!-- saved from url=(0065)https://www.w3resource.com/java-exercises/basic/index.php#editorr -->
<html xmlns:fb="facebook.com/2008/fbml" class="mdl-js"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><script async="" src="./Bai19_files/async-ads.js.tải xuống"></script><script type="text/javascript">

(function() {
	window.trackingUtils=function(k,b,d,n,o,g,c,p,r,m){var f={},i=new RegExp("/(ref=[\\w]+)/?","i"),h=function(s){return s&&encodeURIComponent(s).replace(/&/g,"&amp;").replace(/"/g,"&quot;").replace(/</g,"&lt;").replace(/>/g,"&gt;");},l=(function(){var s=document.createElement("a");s.href=(window.location!==window.parent.location)?document.referrer:document.location;return s.protocol+"//"+s.hostname+((s.port===""||s.port==="80"||s.port==="443")?"":(":"+s.port))+(s.pathname.indexOf("/")!==0?("/"+s.pathname):s.pathname);}()),q=(function(){return h(l);}()),j=function(s,u,v,t){if(typeof v==="string"&&v!==""){if(s.search===""){s.search="?"+u+"="+v;}else{if(!s.search.match(new RegExp("[?&]"+u+"="))){s.search=s.search.replace(/\?/,"?"+u+"="+v+"&");}else{if(t){s.search=s.search.replace(new RegExp(u+"=([^&]*)"),u+"="+v);}}}}return s;},e=function(u,s,t){if(typeof t==="string"&&t!==""){if(!u.match(/\?/)){u=u+"?"+s+"="+t;}else{if(!u.match(s)){u=u.replace(/\?/,"?"+s+"="+t+"&");}}}return u;},a=function(t){var s=(typeof c!=="undefined")?c:0;if(typeof t!=="undefined"){s=t;}return s;};f.addRefUrls=function(x,y,t,s){var z=new RegExp("^http://.*(amazon|endless|myhabit|amazonwireless|javari|smallparts)\\.(com|ca|co\\.jp|de|fr|co\\.uk|cn|it|es)/.*","i"),u,w,v;for(v=0;v<x.length;v++){x[v].rel="nofollow";u=String(x[v].href);if(w=u.match(z)){x[v].href=f.addTrackingParameters(x[v],y,t,s);}}};f.addRefRefUrl=function(s){return j(s,"ref-refURL",q);};f.getRefRefUrl=function(){return q;};f.getRawRefUrl=function(){return l;};f.addSignature=function(t,s,u){return j(j(t,"sig",s),"sigts",u);};f.addLinkCode=function(t,s){return j(t,"linkCode",s);};f.addTrackingId=function(t,s){return j(t,"tag",s);};f.addLinkId=function(s,t){return j(s,"linkId",t);};f.addSubtag=function(s,t){return j(s,"ascsubtag",t);};f.addCreativeAsin=function(s,t){return j(j(s,"creativeASIN",t),"adId",t);};f.addAdType=function(t,s){return j(t,"adType",s);};f.addAdMode=function(s,t){return j(s,"adMode",t);};f.addAdFormat=function(t,s){return j(t,"adFormat",s);};f.addImpressionTimestamp=function(s,t){if(typeof t==="number"){t=t.toString();}return j(s,"impressionTimestamp",t);};f.convertToRedirectedUrl=function(s,v,t){var u=document.createElement("a");u.setAttribute("href",v);if(typeof t!=="undefined"){j(u,t,h(s.getAttribute("href")),true);}else{u.setAttribute("href",v+"/"+u.getAttribute("href"));}s.setAttribute("href",u.getAttribute("href"));return s;};f.getImpressionToken=function(){return g;};f.getClickUrl=function(){return o;};f.addImpressionToken=function(t,u){var s=a(u);if(typeof g==="string"&&g!==""){j(t,"imprToken",g);if(typeof s!=="undefined"){j(t,"slotNum",s);}}return t;};f.addImpressionTokenStr=function(u,t){var s=a(t);if(typeof g==="string"&&g!==""){u=e(u,"imprToken",g);if(typeof s!=="undefined"){u=e(u,"slotNum",s);}}return u;};f.addTrackingParameters=function(y,z,x,C,v,s,w,u,t,D,B,A){return f.addSignature(f.addCreativeAsin(f.addLinkId(f.addTrackingId(f.addSubtag(f.addLinkCode(f.addRefRefUrl(f.addImpressionToken(f.addRefMarker(f.addAdType(f.addAdMode(f.addAdFormat(f.addImpressionTimestamp(y,A),B),D),t),v))),x),p),C),z),s),w,u);};f.addRefMarker=function(t,v){var u,s=false;if(typeof v==="undefined"){return t;}if(u=t.pathname.match(i)){t.pathname=t.pathname.replace(u[1],"ref="+v);}else{s=(t.pathname.charAt(t.pathname.length-1)==="/");t.pathname=t.pathname+(s?"":"/")+"ref="+v;}return t;};f.getRefMarker=function(s){var t;if(t=s.pathname.match(i)){return t[1].substr(4);}else{return undefined;}};f.makeForesterCall=function(u){var s=undefined,t;u.refUrl=document.location.href;if(typeof JSON!=="undefined"){t=JSON.stringify(u);}else{if(typeof amzn_assoc_utils!=="undefined"&&typeof amzn_assoc_utils.stringify==="function"){t=amzn_assoc_utils.stringify(u);}else{return;}}if(typeof n==="string"){s=n+"?assoc_payload="+encodeURIComponent(t);}if(typeof s!=="undefined"){(new Image()).src=s;}};f.recordImpression=function(t,s,v,u){v.linkCode=t;v.trackingId=s;if(m||!r){f.makeForesterCall(v);}else{f.addABPFlag(v,f.makeForesterCall);}if(typeof u==="undefined"||!u){(new Image()).src=d+"?l="+t+"&t="+s+"&o="+k+"&cb="+(new Date()).getTime();}};f.addAAXClickUrls=function(t){var v,u,s;if(typeof t==="undefined"||typeof o==="undefined"){return;}for(u=0;u<t.length;u++){s=String(t[u].href);if(s.indexOf(o)<0){v=o+s;t[u].href=v;}}};f.addAAXClickUrl=function(s){if(typeof s==="undefined"||typeof s==="undefined"||s.indexOf(o)===0){return s;}return o+s;};f.updateLinks=function(t,v){var u,s;if(typeof v!=="function"){return;}for(u=0;u<t.length;u++){s=String(t[u].href);t[u].href=v(s);}};f.elementInViewPort=function(s){var t=s.getBoundingClientRect(),u=(t.top>=0&&t.left>=0&&t.bottom<=(window.innerHeight||document.documentElement.clientHeight)&&t.right<=(window.innerWidth||document.documentElement.clientWidth));return{posX:t.left+window.pageXOffset,posY:t.top+window.pageYOffset,inViewPort:u};};f.initialViewabilityCall=function(y,t,v,x){var s=undefined,u,w={adViewability:[{above_the_fold:y,topPos:t,leftPos:v,slotNum:x}]};if(typeof JSON!=="undefined"){u=JSON.stringify(w);}else{if(typeof amzn_assoc_utils!=="undefined"&&typeof amzn_assoc_utils.stringify==="function"){u=amzn_assoc_utils.stringify(w);}else{u="";}}if(typeof n==="string"){s=n+u;}if(typeof s!=="undefined"){(new Image()).src=s+"&cb="+(new Date()).getTime();}};f.makeViewabilityCall=function(v){var s=undefined,t,u={adViewability:[{viewable:true,slotNum:v}]};if(typeof JSON!=="undefined"){t=JSON.stringify(u);}else{if(typeof amzn_assoc_utils!=="undefined"&&typeof amzn_assoc_utils.stringify==="function"){t=amzn_assoc_utils.stringify(u);}else{t="";}}if(typeof n==="string"){s=n+t;}if(typeof s!=="undefined"){(new Image()).src=s+"&cb="+(new Date()).getTime();}};f.addABPFlag=function(v,D){var x=false,w=2,u=document.body?document.body.appendChild(new Image()):new Image(),t=document.body?document.body.appendChild(new Image()):new Image(),A=false,y=false,s=Math.random()*11,C=r+"?ch=*&rn=*",B=function(F,E){if(w===0||E>1000){v.supplySideMetadata={ABPInstalled:w===0&&x};F(v);}else{setTimeout(function(){B(F,E*2);},E*2);}},z=function(){if(--w){return;}x=!A&&y;};u.style.display="none";t.style.display="none";u.onload=z;u.onerror=function(){A=true;z();};u.src=C.replace(/\*/,1).replace(/\*/,s);t.onload=z;t.onerror=function(){y=true;z();};t.src=C.replace(/\*/,2).replace(/\*/,s);B(D,250);};return f;};window.elemTracker=function(b){var a={};a.trackElements=function(d,c){var f,e;if(typeof d!=="undefined"&&d.length>0&&typeof c==="function"){window.addEventListener("scroll",function(){for(f=0;f<d.length;f++){e=b.elementInViewPort(d[f]);if(e.inViewPort){c();}}},false);}};return a;};
	var amznAutoTaggerMaker=function(j,l,m){var I={CA:"ca",CN:"cn",IN:"in",DE:"de",FR:"fr",GB:"co.uk",JP:"co.jp",US:"com"},F={CA:[],CN:[],IN:[],DE:["javari"],FR:["javari"],GB:["javari"],JP:["javari"],US:["smallparts","amazonwireless","endless","myhabit"]},x=(function(){var L=-1,K={};K.getNextSlotNum=function(){return ++L;};return K;}()),d,B,J=Math.max(document.body.scrollHeight,document.body.offsetHeight,document.documentElement.clientHeight,document.documentElement.scrollHeight,document.documentElement.offsetHeight),g=Math.max(document.body.scrollWidth,document.body.offsetWidth,document.documentElement.clientWidth,document.documentElement.scrollWidth,document.documentElement.offsetWidth),w={totalDocWidth:g,totalDocHeight:J,logType:"onetag_pageload",pageTitle:document.title},C="w50",q="w61",o="g12",k={},s=new RegExp("%3F"),t=[],H=new Object(),D=false,E="",c="",r=0,b=0,A=0,v=new RegExp("amzn.to"),e=new RegExp(j.redirectorEndPoint),p=["kdp.amazon.com"],n=function(L){var M,K=false;for(M=0;M<p.length;M++){if(L.match(p[M])){K=true;break;}}return K;},y=function(K){return K.nextSibling&&K.nextSibling.tagName==="IMG"&&K.nextSibling.hasAttribute("src")&&(K.nextSibling.getAttribute("src").search(/ir-[a-z]{2}\.amazon-adsystem\.com/)>-1||K.nextSibling.getAttribute("src").search(/www\.assoc-amazon\.*/)>-1);},f=function(K){if(!K.href.match(e)){K.href=j.redirectorEndPoint+K.href;}},z=function(U,Z){var V=new RegExp("/(ref=[\\w]+)/?","i"),Q,Y=false,L,O,P=false,T=U.search.match(/\?tag=([^&]+)|&tag=([^&]+)|\?tag-value=([^&]+)|&tag-value=([^&]+)|\?tag_value=([^&]+)|&tag_value=([^&]+)|\?t=([^&]+)|&t=([^&]+)/),N=U.search.match(/\?tag=|&tag=|\?tag-value=|&tag-value=|\?tag_value=|&tag_value=|\?t=|&t=/),K=U.search.match(/(linkCode|link_code|lc)=([^&]+)/i),S=l.elementInViewPort(U),X={autoTagged:false,overwritten:false,geoRedirected:false,atf:S.inViewPort},M=x.getNextSlotNum(),R={destinationURL:U.href,slotNum:M,atfInFirstLoad:S.inViewPort,posX:S.posX,posY:S.posY,logType:"onetag_textlink"},W=y(U);X.slotNum=M;if(U.pathname.charAt(U.pathname.length-1)!=="/"){U.pathname=U.pathname+"/";}if(U.search===""){U.search="?imprToken="+l.getImpressionToken()+"&slotNum="+M;}else{U.search=U.search.replace(/\?/,"?imprToken="+l.getImpressionToken()+"&slotNum="+M+"&");}if(j.enableAutoTagging){X.autoTagged=true;if(T){if(j.overwrite){for(O=1;O<9;O++){if(T[O]!=undefined){U.search=U.search.replace(T[O],Z);break;}}X.overwritten=true;Y=true;}}else{if(N){U.search=U.search.replace(/tag=/,"tag="+Z);Y=true;}else{U.search=U.search.replace(/\?/,"?tag="+Z+"&");Y=true;}}}if(K&&typeof j.overridableLinkCodes[K[2]]!=="undefined"){P=true;}if(K&&!P){L=K[2];}else{L=Y?C:q;}if(K){R.oldLinkCode=K[2];U.search=U.search.replace(K[2],L);}else{U.search=U.search.replace(/\?/,"?linkCode="+L+"&");}if(Q=U.pathname.match(V)){U.pathname=U.pathname.replace(Q[1],"ref=as_at");}else{U.pathname=U.pathname+"ref=as_at";}if(Y){l.recordImpression(L,Z,R,W);}else{if(typeof T!=="undefined"&&T instanceof Array&&T.length>=O+1&&typeof T[O]==="string"){l.recordImpression(L,T[O],R,W);}else{l.recordImpression(L,"",R,W);}}if(k.shouldBeGeoRedirected()){X.geoRedirected=true;f(U);}if(U.hasAttribute("data-amzn-asin")&&!U.search.match("creativeASIN")){U.search=U.search.replace(/\?/,"?creativeASIN="+U.getAttribute("data-amzn-asin")+"&");}l.initialViewabilityCall(S.inViewPort,S.posX,S.posY,M);U.href=l.addAAXClickUrl(U.href);return X;},G=function(K){if(K.href.match(s)){B=K.href.split(s);K.href=B[0]+"?"+decodeURIComponent(B[1]);}},a=function(P,L,K,O){var N,M;for(N=0;N<L.length;N++){for(M=0;M<K.length;M++){if(window.addEventListener){L[N].addEventListener(K[M],O,false);}else{L[N].attachEvent("on"+K[M],O);}P.push({el:L[N],h:O,t:K[M]});}}},h=function(){var K="";for(i=0;i<j.itemRefs.length;i++){if(typeof j.itemRefs[i].type!=="undefined"&&j.itemRefs[i].type==="ASIN"&&typeof j.itemRefs[i].sourceLink!=="undefined"&&String(j.itemRefs[i].sourceLink).match(v)!==null&&typeof j.itemRefs[i].destinationLink!=="undefined"){H[j.itemRefs[i].sourceLink]=j.itemRefs[i].destinationLink;if(E!==""){K=",";}E=E+K+j.itemRefs[i].sourceLink;r++;}}},u=function(L,K){m.trackElements([L],function(){if(typeof K!==undefined&&K.slotNum!==undefined&&(K.viewed===undefined||!K.viewed)){l.makeViewabilityCall(K.slotNum);K.viewed=true;}});};if(j.locale!=undefined){d=j.locale;}else{d="US";}k.shouldBeGeoRedirected=function(){return j.enableGeoRedirection&&(j.region!==""&&j.region!==j.viewerCountry);};k.publisherCallBack=function(){window["amzn_assoc_client_cb_"+j.adUnitSlotNum]({type:"onload",data:{},widget:k});};k.decorateLinkElement=function(K){G(K);linkProperties=z(K,j.trackingId);u(K,linkProperties);return linkProperties;};k.tagLinks=function(ab){var ad,ac,L,W,af,Y=[],ah=0,T,V,ae,aa,ag,K,U,R=0,N=0,X=0,M=0,Q=0,O=0,P,S,Z="";L=I[d];W=F[d];af=new RegExp("^(http|https)://(www|[\\w\\-\\.]+)?amazon\\.("+L+")/","i");if(W){for(ah=0;ah<W.length;ah++){T=L;if(L=="co.jp"){T="co.jp|jp";}Y[ah]=new RegExp("^(http|https)://(www\\.)?("+W[ah]+")\\.("+T+")/","i");}}V=ab.getElementsByTagName("a");if(!D){h();D=true;}for(ad=0;ad<V.length;ad++){U=undefined;ae=String(V[ad].href);if(aa=ae.match(af)&&!n(ae)){U=k.decorateLinkElement(V[ad]);}else{if(j.isShortLinksSupported&&(ag=ae.match(v))!==null){b++;if(c!==""){Z=",";}c=c+Z+V[ad].href;P=H[V[ad].href];if(typeof P!=="undefined"){A++;V[ad].setAttribute("href",P);U=k.decorateLinkElement(V[ad]);}else{if(k.shouldBeGeoRedirected()){U=k.decorateLinkElement(V[ad]);}}}else{for(K=0;K<Y.length;K++){if(aa=ae.match(Y[K])){k.decorateLinkElement(V[ad]);}}}}if(typeof U!=="undefined"){if(U.autoTagged){N++;}if(U.overwritten){O++;}if(U.geoRedirected){X++;}if(U.atf){M++;}else{Q++;}R++;}}w.numLinks=R;w.numAutoTaggedLinks=N;w.autoTaggingEnabled=j.enableAutoTagging;w.geoRedirectEnabled=j.enableGeoRedirection;w.numLinksATF=M;w.numLinksBTF=Q;w.shortLinksInLivePool=E;w.shortLinksInPage=c;w.shortLinksInLivePoolCount=r;w.shortLinksInPageCount=b;w.shortLinksMatchCount=A;l.recordImpression(j.linkCode,j.trackingId,w);};return k;};
    var spec = {
        trackingId : "w3resource-20",
        region : "US",
        overwrite : false,
        enableAutoTagging : false,
        linkCode : "w49",
        overridableLinkCodes :  {   "am1": ""   , "am2": ""   , "am3": ""   , "as1": ""   , "as2": ""   , "as3": ""   , "as4": ""   , "li1": ""   , "li2": ""   , "li3": ""   , "ll1": ""   , "ll2": ""   },
        enableGeoRedirection : true,
        redirectorEndPoint : "https://assoc-redirect.amazon.com/g/r/",
        adUnitSlotNum : "0",
        itemRefs : [],
        isShortLinksSupported : true,
        viewerCountry : "VN"
    }, trackingUtils = window.trackingUtils(
        "1",
        "//fls-na.amazon-adsystem.com/1/associates-ads/1/OP/r/json",
        "//ir-na.amazon-adsystem.com/e/ir",
        "https://aax-us-east.amazon-adsystem.com/x/px/QmTaksgN5MvwVzwt27TZ1joAAAFiBjVyyAEAAAFKARcbcNc/", "https://aax-us-east.amazon-adsystem.com/x/c/QmTaksgN5MvwVzwt27TZ1joAAAFiBjVyyAEAAAFKARcbcNc/", "D.HaOrMl2Q4h96SxyFPQGg", undefined, undefined, undefined, true
    );

    window.amznAutoTagger = amznAutoTaggerMaker(spec, trackingUtils, window.elemTracker(trackingUtils));
    window.amznAutoTagger.tagLinks(document);
    window.amznAutoTagger.publisherCallBack();
}());

 //# sourceURL=dynscript-0.js</script>

<script src="./Bai19_files/ca-pub-2153208817642134.js.tải xuống"></script><script type="text/javascript" async="" src="./Bai19_files/cse.js.tải xuống"></script><script async="" src="./Bai19_files/analytics.js.tải xuống"></script><script type="text/javascript">
//<![CDATA[
window.__cfRocketOptions = {byc:0,p:0,petok:"0297dfba9bd79290f0a52ec978b011bf4253d074-1520522582-1800"};
//]]>
</script>
<script type="text/javascript" src="./Bai19_files/rocket.min.js.tải xuống"></script>
<link type="text/css" rel="stylesheet" href="./Bai19_files/material.min.css">
<link type="text/css" rel="stylesheet" href="./Bai19_files/additional.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="https://www.w3resource.com/images/favicon.png">
<title>Java Basic Programming Exercises - w3resource</title>
<meta name="Keywords" content="w3resource, Java programming exercises, exercises, solution">
<meta name="Description" content="Practice with solution of exercises on Java basic: examples on variables, date, operator, input, output and more from w3resource.">
<meta property="og:title" content="Java Basic Programming Exercises - w3resource">
<meta property="og:description" content="Practice with solution of exercises on Java basic: examples on variables, date, operator, input, output and more from w3resource.">
<meta property="og:url" content="https://www.w3resource.com/java-exercises/basic/index.php">
<meta property="og:image" content="//www.w3resource.com/w3r_images/java-exercises.png">
<meta property="og:site_name" content="w3resource">
<link rel="preload" href="./Bai19_files/integrator.js.tải xuống" as="script"><script type="text/javascript" src="./Bai19_files/integrator.js.tải xuống"></script><link rel="preload" href="./Bai19_files/integrator.js(1).tải xuống" as="script"><script type="text/javascript" src="./Bai19_files/integrator.js(1).tải xuống"></script><script src="./Bai19_files/jsapi" type="text/javascript"></script><link type="text/css" href="./Bai19_files/default+en.css" rel="stylesheet"><link type="text/css" href="./Bai19_files/default.css" rel="stylesheet"><script type="text/javascript" src="./Bai19_files/default+en.I.js.tải xuống"></script><style type="text/css">.gsc-control-cse{font-family:Arial, sans-serif;border-color:#FFFFFF;background-color:#FFFFFF}.gsc-control-cse .gsc-table-result{font-family:Arial, sans-serif}input.gsc-input,.gsc-input-box,.gsc-input-box-hover,.gsc-input-box-focus{border-color:#D9D9D9}.gsc-search-button-v2,.gsc-search-button-v2:hover,.gsc-search-button-v2:focus{border-color:#666666;background-color:#CECECE;background-image:none;filter:none}.gsc-search-button-v2 svg{fill:#FFFFFF}.gsc-tabHeader.gsc-tabhInactive{border-color:#E9E9E9;background-color:#E9E9E9}.gsc-tabHeader.gsc-tabhActive{border-color:#FF9900;border-bottom-color:#FFFFFF;background-color:#FFFFFF}.gsc-tabsArea{border-color:#FF9900}.gsc-webResult.gsc-result,.gsc-results .gsc-imageResult{border-color:#FFFFFF;background-color:#FFFFFF}.gsc-webResult.gsc-result:hover,.gsc-imageResult:hover{border-color:#FFFFFF;background-color:#FFFFFF}.gs-webResult.gs-result a.gs-title:link,.gs-webResult.gs-result a.gs-title:link b,.gs-imageResult a.gs-title:link,.gs-imageResult a.gs-title:link b{color:#0000CC}.gs-webResult.gs-result a.gs-title:visited,.gs-webResult.gs-result a.gs-title:visited b,.gs-imageResult a.gs-title:visited,.gs-imageResult a.gs-title:visited b{color:#0000CC}.gs-webResult.gs-result a.gs-title:hover,.gs-webResult.gs-result a.gs-title:hover b,.gs-imageResult a.gs-title:hover,.gs-imageResult a.gs-title:hover b{color:#0000CC}.gs-webResult.gs-result a.gs-title:active,.gs-webResult.gs-result a.gs-title:active b,.gs-imageResult a.gs-title:active,.gs-imageResult a.gs-title:active b{color:#0000CC}.gsc-cursor-page{color:#0000CC}a.gsc-trailing-more-results:link{color:#0000CC}.gs-webResult .gs-snippet,.gs-imageResult .gs-snippet,.gs-fileFormatType{color:#000000}.gs-webResult div.gs-visibleUrl,.gs-imageResult div.gs-visibleUrl{color:#008000}.gs-webResult div.gs-visibleUrl-short{color:#008000}.gs-webResult div.gs-visibleUrl-short{display:none}.gs-webResult div.gs-visibleUrl-long{display:block}.gs-promotion div.gs-visibleUrl-short{display:none}.gs-promotion div.gs-visibleUrl-long{display:block}.gsc-cursor-box{border-color:#FFFFFF}.gsc-results .gsc-cursor-box .gsc-cursor-page{border-color:#E9E9E9;background-color:#FFFFFF;color:#0000CC}.gsc-results .gsc-cursor-box .gsc-cursor-current-page{border-color:#FF9900;background-color:#FFFFFF;color:#0000CC}.gsc-webResult.gsc-result.gsc-promotion{border-color:#336699;background-color:#FFFFFF}.gsc-completion-title{color:#0000CC}.gsc-completion-snippet{color:#000000}.gs-promotion a.gs-title:link,.gs-promotion a.gs-title:link *,.gs-promotion .gs-snippet a:link{color:#0000CC}.gs-promotion a.gs-title:visited,.gs-promotion a.gs-title:visited *,.gs-promotion .gs-snippet a:visited{color:#0000CC}.gs-promotion a.gs-title:hover,.gs-promotion a.gs-title:hover *,.gs-promotion .gs-snippet a:hover{color:#0000CC}.gs-promotion a.gs-title:active,.gs-promotion a.gs-title:active *,.gs-promotion .gs-snippet a:active{color:#0000CC}.gs-promotion .gs-snippet,.gs-promotion .gs-title .gs-promotion-title-right,.gs-promotion .gs-title .gs-promotion-title-right *{color:#000000}.gs-promotion .gs-visibleUrl,.gs-promotion .gs-visibleUrl-short{color:#008000}</style><script type="text/javascript" async="" src="./Bai19_files/embed.js.tải xuống"></script><link rel="preload" as="style" href="https://c.disquscdn.com/next/embed/styles/lounge.2d848eddee1b8c12749b72a04b2b33dc.css"><link rel="preload" as="script" href="https://c.disquscdn.com/next/embed/common.bundle.774abcf1e2c32f6ee53499b090f48ff0.js"><link rel="preload" as="script" href="https://c.disquscdn.com/next/embed/lounge.bundle.8241ae5fc761eb94635acdc63f5fd29f.js"><link rel="preload" as="script" href="https://disqus.com/next/config.js"><script src="./Bai19_files/clipboard.min.js.tải xuống"></script><style>#aswift_1_anchor{opacity:1 !important;overflow: visible !important}</style><style></style><style type="text/css">.gscb_a{display:inline-block;font:27px/13px arial,sans-serif}.gsst_a .gscb_a{color:#a1b9ed;cursor:pointer}.gsst_a:hover .gscb_a,.gsst_a:focus .gscb_a{color:#36c}.gsst_a{display:inline-block}.gsst_a{cursor:pointer;padding:0 4px}.gsst_a:hover{text-decoration:none!important}.gsst_b{font-size:16px;padding:0 2px;position:relative;user-select:none;-webkit-user-select:none;white-space:nowrap}.gsst_e{opacity:0.55;}.gsst_a:hover .gsst_e,.gsst_a:focus .gsst_e{opacity:0.72;}.gsst_a:active .gsst_e{opacity:1;}.gsst_f{background:white;text-align:left}.gsst_g{background-color:white;border:1px solid #ccc;border-top-color:#d9d9d9;box-shadow:0 2px 4px rgba(0,0,0,0.2);-webkit-box-shadow:0 2px 4px rgba(0,0,0,0.2);margin:-1px -3px;padding:0 6px}.gsst_h{background-color:white;height:1px;margin-bottom:-1px;position:relative;top:-1px}.gsib_a{width:100%;padding:4px 6px 0}.gsib_a,.gsib_b{vertical-align:top}.gssb_c{border:0;position:absolute;z-index:989}.gssb_e{border:1px solid #ccc;border-top-color:#d9d9d9;box-shadow:0 2px 4px rgba(0,0,0,0.2);-webkit-box-shadow:0 2px 4px rgba(0,0,0,0.2);cursor:default}.gssb_f{visibility:hidden;white-space:nowrap}.gssb_k{border:0;display:block;position:absolute;top:0;z-index:988}.gsdd_a{border:none!important}.gsq_a{padding:0}.gsq_a{padding:0}.gscsep_a{display:none}.gssb_a{padding:0 7px}.gssb_a,.gssb_a td{white-space:nowrap;overflow:hidden;line-height:22px}#gssb_b{font-size:11px;color:#36c;text-decoration:none}#gssb_b:hover{font-size:11px;color:#36c;text-decoration:underline}.gssb_g{text-align:center;padding:8px 0 7px;position:relative}.gssb_h{font-size:15px;height:28px;margin:0.2em;-webkit-appearance:button}.gssb_i{background:#eee}.gss_ifl{visibility:hidden;padding-left:5px}.gssb_i .gss_ifl{visibility:visible}a.gssb_j{font-size:13px;color:#36c;text-decoration:none;line-height:100%}a.gssb_j:hover{text-decoration:underline}.gssb_l{height:1px;background-color:#e5e5e5}.gssb_m{color:#000;background:#fff}.gsfe_a{border:1px solid #b9b9b9;border-top-color:#a0a0a0;box-shadow:inset 0px 1px 2px rgba(0,0,0,0.1);-moz-box-shadow:inset 0px 1px 2px rgba(0,0,0,0.1);-webkit-box-shadow:inset 0px 1px 2px rgba(0,0,0,0.1);}.gsfe_b{border:1px solid #4d90fe;outline:none;box-shadow:inset 0px 1px 2px rgba(0,0,0,0.3);-moz-box-shadow:inset 0px 1px 2px rgba(0,0,0,0.3);-webkit-box-shadow:inset 0px 1px 2px rgba(0,0,0,0.3);}.gssb_a{padding:0 9px}.gsib_a{padding-right:8px;padding-left:8px}.gsst_a{padding-top:5.5px}.gssb_e{border:0}.gssb_l{margin:5px 0}input.gsc-input::-webkit-input-placeholder{font-size:14px}input.gsc-input:-moz-placeholder{font-size:14px}input.gsc-input::-moz-placeholder{font-size:14px}input.gsc-input:-ms-input-placeholder{font-size:14px}input.gsc-input:focus::-webkit-input-placeholder{color:transparent}input.gsc-input:focus:-moz-placeholder{color:transparent}input.gsc-input:focus::-moz-placeholder{color:transparent}input.gsc-input:focus:-ms-input-placeholder{color:transparent}.gssb_c .gsc-completion-container{position:static}.gssb_c{z-index:5000}.gsc-completion-container table{background:transparent;font-size:inherit;font-family:inherit}.gssb_c > tbody > tr,.gssb_c > tbody > tr > td,.gssb_d,.gssb_d > tbody > tr,.gssb_d > tbody > tr > td,.gssb_e,.gssb_e > tbody > tr,.gssb_e > tbody > tr > td{padding:0;margin:0;border:0}.gssb_a table,.gssb_a table tr,.gssb_a table tr td{padding:0;margin:0;border:0}</style><style>#_no-clickjacking-0{opacity:1 !important;overflow: visible !important}</style></head>
<body><div role="dialog" aria-live="polite" aria-label="cookieconsent" aria-describedby="cookieconsent:desc" class="cc-window cc-banner cc-type-info cc-theme-block cc-bottom cc-color-override-688238583 " style=""><!--googleoff: all--><span id="cookieconsent:desc" class="cc-message">This website uses cookies to ensure you get the best experience on our website. <a aria-label="learn more about cookies" role="button" tabindex="0" class="cc-link" href="http://cookiesandyou.com/" target="_blank">Learn more</a></span><div class="cc-compliance"><a aria-label="dismiss cookie message" role="button" tabindex="0" class="cc-btn cc-dismiss">Got it!</a></div><!--googleon: all--></div>
<style type="text/css">
article a {
text-decoration: none	
}
.mdl-menu {
min-width: 1024px;	
}
.mdl-menu__item {
height: 24px;
line-height: 24px	
}
.header_notice a{
color: #fff
}
</style>
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-21234995-1', 'auto');
  ga('send', 'pageview');
</script>
<script>
window.addEventListener("load", function(){
window.cookieconsent.initialise({
  "palette": {
    "popup": {
      "background": "#000"
    },
    "button": {
      "background": "#f1d600"
    }
  }
})});
</script>


<script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>


<div class="mdl-layout mdl-layout--fixed-header">
<header class="mdl-layout__header">
<div class="mdl-layout__header-row">
<a href="https://www.w3resource.com/" style="text-decoration: none;"><span class="mdl-layout-title" style="margin-left: -50px;margin-top: -5px;color:#fff">w3resource</span></a>

<button id="main-menu-lower-right" class="mdl-button mdl-js-button mdl-button--icon" data-upgraded=",MaterialButton">
<i class="material-icons">menu</i>
</button>

<nav class="mdl-navigation mdl-layout--large-screen-only">
<div class="mdl-menu__container is-upgraded"><div class="mdl-menu__outline"></div><div class="mdl-grid mdl-menu mdl-cell-mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect mdl-js-ripple-effect--ignore-events" style="width: 100%; overflow-x:hidden;height:360px;overflow-y: scroll" for="main-menu-lower-right" data-upgraded=",MaterialMenu,MaterialRipple">
<div class="mdl-cell mdl-cell--3-col">
<ul>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">Front End<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/html/HTML-tutorials.php">HTML</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/css/CSS-tutorials.php">CSS</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/javascript/javascript.php">JavaScript</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/html5/introduction.php">HTML5</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/schema.org/introduction.php">Schema.org</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/phpjs/use-php-functions-in-javascript.php">php.js</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/twitter-bootstrap/tutorial.php">Twitter Bootstrap</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/responsive-web-design/overview.php">Responsive Web Design tutorial</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/zurb-foundation3/introduction.php">Zurb Foundation 3 tutorials</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/pure/">Pure CSS</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/html5-canvas/">HTML5 Canvas</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/course/javascript-course.html" target="_blank">JavaScript Course</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/icon/">Icon</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">Linux<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/linux-system-administration/installation.php">Linux Home</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/linux-system-administration/linux-commands-introduction.php">Linux Commands</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/linux-system-administration/installation.php">Linux Server Administration</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
</ul>
</div>
<div class="mdl-cell mdl-cell--3-col">
<ul>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">Back End<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/php/php-home.php">PHP</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/python/python-tutorial.php">Python</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/java-tutorial/">Java</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/node.js/node.js-tutorials.php">Node.js</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/ruby/">Ruby</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/c-programming/programming-in-c.php">C programming</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">SQL &amp; RDBMS<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/sql/tutorials.php">SQL(2003 standard of ANSI)</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/mysql/mysql-tutorials.php">MySQL</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://w3resource.com/PostgreSQL/tutorial.php">PostgreSQL</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/sqlite/">SQLite</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">NoSQL &amp; MongoDB<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/mongodb/nosql.php">NoSQL</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/mongodb/nosql.php">MongoDB</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">API<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/API/google-plus/tutorial.php">Google Plus API</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/API/youtube/tutorial.php">Youtube API</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/API/google-maps/index.php">Google Maps API</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/API/flickr/tutorial.php">Flickr API</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/API/last.fm/tutorial.php">Last.fm API</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/API/twitter-rest-api/">Twitter REST API</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
</ul>
</div>
<div class="mdl-cell mdl-cell--3-col">
<ul>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">Data Interchnage<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/xml/xml.php">XML</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/JSON/introduction.php">JSON</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/ajax/introduction.php">Ajax</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">Exercises<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/html-css-exercise/index.php">HTML CSS Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/javascript-exercises/">JavaScript Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/jquery-exercises/">jQuery Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/jquery-ui-exercises/">jQuery-UI Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/coffeescript-exercises/">CoffeeScript Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/php-exercises/">PHP Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/python-exercises/">Python Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/c-programming-exercises/">C Programming Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/csharp-exercises/">C# Sharp Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/java-exercises/">Java Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/sql-exercises/">SQL Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/oracle-exercises/">Oracle Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/mysql-exercises/">MySQL Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/sqlite-exercises/">SQLite Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/postgresql-exercises/">PostgreSQL Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/mongodb-exercises/">MongoDB Exercises</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/twitter-bootstrap/examples.php">Twitter Bootstrap Examples</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/euler-project/">Euler Project</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
</ul>
</div>
<div class="mdl-cell mdl-cell--3-col">
<ul>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">Quiz<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://w3resource.com/w3skills/html5-quiz/">HTML5 Quiz</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://w3resource.com/w3skills/php-fundamentals/">PHP Quiz</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://w3resource.com/w3skills/sql-beginner/">SQL Quiz</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://w3resource.com/w3skills/python-beginner-quiz/">Python Quiz</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://w3resource.com/w3skills/mysql-basic-quiz/">MySQL Quiz</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://w3resource.com/w3skills/javascript-basic-skill-test/">JavaScript I Quiz</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://w3resource.com/w3skills/javascript-advanced-quiz/">JavaScript II Quiz</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://w3resource.com/w3skills/javascript-quiz-part-iii/">JavaScript III Quiz</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://w3resource.com/w3skills/mongodb-basic-quiz/">MongoDB Quiz</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">Form Template<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/form-template/">Forms Template</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">Slides<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/slides/">Slides Presentation</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">Google Docs<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/form-template/">Forms Template</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/slides/">Slide Presentation</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">Conversion Tools<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/convert/number/binary-to-decimal.php">Number Conversion</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">MS Excel<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/excel/">Excel 2013 tutorial</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">Videos<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/video-tutorial/php/some-basics-of-php.php">PHP Videos</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/video-tutorial/javascript/list-of-tutorial.php">JavaScript Videos</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" style="color:#f86d1d;height:24px; line-height: 24px" tabindex="-1" data-upgraded=",MaterialRipple">Tools<span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/web-development-tools/firebug-tutorials.php">Firebug Tutorial</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-cell--12-col mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.w3resource.com/web-development-tools/useful-web-development-tools.php">Useful Tools</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
</ul>
</div>
</div></div>
</nav>
<div class="np"><span class="previousNext"><a href="https://www.w3resource.com/java-exercises/index.php"><i class="material-icons" style="margin-left: 40px; color: rgb(255, 255, 255); vertical-align: middle;">skip_previous</i></a><a href="https://www.w3resource.com/java-exercises/datatypes/index.php"><i class="material-icons" style="margin-left: 30px; color: rgb(255, 255, 255); vertical-align: middle;">skip_next</i></a></span></div>
<div class="mdl-layout-spacer"></div>
<div class="header_notice"><a href="https://goo.gl/forms/WdU5vlk4PeMKs4bi1" target="_blank">Help us improve w3resource. Please take this survey.</a></div>
<div class="mdl-textfield mdl-js-textfield mdl-textfield--expandable mdl-textfield--floating-label mdl-textfield--align-right is-upgraded" data-upgraded=",MaterialTextfield">

<div class="mdl-textfield__expandable-holder">
<input class="mdl-textfield__input" type="text" name="sample" id="fixed-header-drawer-exp">
</div>
</div>
<nav class="mdl-navigation mdl-layout--large-screen-only">


<style type="text/css">
   .gsc-control-cse
    {
        height:20px;
        background-color: rgb(63,81,181);
        border:0;
        margin-top: -15px;
        !important;     
    }
    .gsc-control-cse-en
    {
        height:20px;
        background-color: rgb(63,81,181);
        border:0;
        margin-top: -15px;
        !important;
    }
</style>
<div class="customSearch" style="border:0px solid;margin:-20px;width:400px;height:auto;">
<script>
  (function() {
    var cx = '013584948386948090933:pjqiqxq1drs';
    var gcse = document.createElement('script');
    gcse.type = 'text/javascript';
    gcse.async = true;
    gcse.src = 'https://cse.google.com/cse.js?cx=' + cx;
    var s = document.getElementsByTagName('script')[0];
    s.parentNode.insertBefore(gcse, s);
    })();
 </script>
<div id="___gcse_0"><div class="gsc-control-cse gsc-control-cse-en"><div class="gsc-control-wrapper-cse" dir="ltr"><form class="gsc-search-box gsc-search-box-tools" accept-charset="utf-8"><table cellspacing="0" cellpadding="0" class="gsc-search-box"><tbody><tr><td class="gsc-input"><div class="gsc-input-box" id="gsc-iw-id1"><table cellspacing="0" cellpadding="0" id="gs_id50" class="gstl_50 " style="width: 100%; padding: 0px;"><tbody><tr><td id="gs_tti50" class="gsib_a"><input autocomplete="off" type="text" size="10" class="gsc-input" name="search" title="search" id="gsc-i-id1" x-webkit-speech="" x-webkit-grammar="builtin:search" lang="en" dir="ltr" spellcheck="false" placeholder="Custom Search" style="width: 100%; padding: 0px; border: none; margin: 0px; height: auto; outline: none; background: url(&quot;https://www.google.com/cse/static/images/1x/googlelogo_lightgrey_46x16dp.png&quot;) left center no-repeat rgb(255, 255, 255); text-indent: 48px;"></td><td class="gsib_b"><div class="gsst_b" id="gs_st50" dir="ltr"><a class="gsst_a" href="javascript:void(0)" style="display: none;"><span class="gscb_a" id="gs_cb50">×</span></a></div></td></tr></tbody></table></div></td><td class="gsc-search-button"><input type="image" src="./Bai19_files/search_box_icon.png" class="gsc-search-button gsc-search-button-v2" title="search"></td><td class="gsc-clear-button"><div class="gsc-clear-button" title="clear results">&nbsp;</div></td></tr></tbody></table><table cellspacing="0" cellpadding="0" class="gsc-branding"><tbody><tr><td class="gsc-branding-user-defined"></td><td class="gsc-branding-text"><div class="gsc-branding-text">powered by</div></td><td class="gsc-branding-img"><img src="./Bai19_files/googlelogo_grey_46x15dp.png" class="gsc-branding-img" srcset="https://www.google.com/cse/static/images/2x/googlelogo_grey_46x15dp.png 2x"></td></tr></tbody></table></form><div class="gsc-results-wrapper-overlay"><div class="gsc-results-close-btn" tabindex="0"></div><div class="gsc-tabsAreaInvisible"><div class="gsc-tabHeader gsc-inline-block gsc-tabhActive">Web</div><span class="gs-spacer"> </span><div tabindex="0" class=" gsc-tabHeader gsc-tabhInactive gsc-inline-block">Image</div><span class="gs-spacer"> </span></div><div class="gsc-refinementsAreaInvisible"></div><div class="gsc-above-wrapper-area-invisible"><table cellspacing="0" cellpadding="0" class="gsc-above-wrapper-area-container"><tbody><tr><td class="gsc-result-info-container"><div class="gsc-result-info-invisible"></div></td><td class="gsc-orderby-container"><div class="gsc-orderby-invisible"><div class="gsc-orderby-label gsc-inline-block">Sort by:</div><div class="gsc-option-menu-container gsc-inline-block"><div class="gsc-selected-option-container gsc-inline-block"><div class="gsc-selected-option">Relevance</div><div class="gsc-option-selector"></div></div><div class="gsc-option-menu-invisible"><div class="gsc-option-menu-item gsc-option-menu-item-highlighted"><div class="gsc-option">Relevance</div></div><div class="gsc-option-menu-item"><div class="gsc-option">Date</div></div></div></div></div></td></tr></tbody></table></div><div class="gsc-adBlockInvisible"></div><div class="gsc-wrapper"><div class="gsc-adBlockInvisible"></div><div class="gsc-resultsbox-invisible"><div class="gsc-resultsRoot gsc-tabData gsc-tabdActive"><table cellspacing="0" cellpadding="0" class="gsc-resultsHeader"><tbody><tr><td class="gsc-twiddleRegionCell"><div class="gsc-twiddle"><div class="gsc-title">Web</div></div><div class="gsc-stats"></div><div class="gsc-results-selector gsc-all-results-active"><div class="gsc-result-selector gsc-one-result" title="show one result">&nbsp;</div><div class="gsc-result-selector gsc-more-results" title="show more results">&nbsp;</div><div class="gsc-result-selector gsc-all-results" title="show all results">&nbsp;</div></div></td><td class="gsc-configLabelCell"></td></tr></tbody></table><div><div class="gsc-expansionArea"></div></div></div><div class="gsc-resultsRoot gsc-tabData gsc-tabdInactive"><table cellspacing="0" cellpadding="0" class="gsc-resultsHeader"><tbody><tr><td class="gsc-twiddleRegionCell"><div class="gsc-twiddle"><div class="gsc-title">Image</div></div><div class="gsc-stats"></div><div class="gsc-results-selector gsc-all-results-active"><div class="gsc-result-selector gsc-one-result" title="show one result">&nbsp;</div><div class="gsc-result-selector gsc-more-results" title="show more results">&nbsp;</div><div class="gsc-result-selector gsc-all-results" title="show all results">&nbsp;</div></div></td><td class="gsc-configLabelCell"></td></tr></tbody></table><div><div class="gsc-expansionArea"></div></div></div></div></div></div><div class="gsc-modal-background-image" tabindex="0"></div></div></div></div>
</div>

<button id="demo-menu-lower-right" class="mdl-button mdl-js-button mdl-button--icon" data-upgraded=",MaterialButton">
<i class="material-icons">share</i>
</button>
<div class="mdl-menu__container is-upgraded"><div class="mdl-menu__outline mdl-menu--bottom-right"></div><ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect mdl-js-ripple-effect--ignore-events" for="demo-menu-lower-right" style="overflow-y:scroll;min-width:200px" data-upgraded=",MaterialMenu,MaterialRipple">
<li class="mdl-menu__item mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://www.facebook.com/w3resource">Facebook</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://twitter.com/w3resource">Twitter</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://plus.google.com/+W3resource">Google Plus</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://in.linkedin.com/in/w3resource">Linkedin</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
<li class="mdl-menu__item mdl-js-ripple-effect" tabindex="-1" data-upgraded=",MaterialRipple"><a href="https://feeds.feedburner.com/W3resource">RSS</a><span class="mdl-menu__item-ripple-container"><span class="mdl-ripple"></span></span></li>
</ul></div>
</nav>
</div>
</header>
<main class="mdl-layout__content">
<div class="page-content">
<div class="mdl-grid">
<div class="mdl-cell mdl-cell--3-col mdl-cell--hide-phone"> <a href="https://www.w3resource.com/"><img src="./Bai19_files/w3resource-logo.png" alt="w3resource logo"></a></div>
<div class="mdl-cell mdl-cell--9-col mdl-cell--hide-phone">
<script type="text/javascript" language="javascript" src="./Bai19_files/getads.js.tải xuống"></script>
<script type="text/javascript" language="javascript">
  //<![CDATA[
    aax_getad_mpb({
      "slot_uuid":"0f1f9886-d533-461c-9bb1-b200b3e51a83"
    });
  //]]>
</script><script src="./Bai19_files/getad"></script><script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>
<!-- top-banner -->
<ins class="adsbygoogle" style="display:inline-block;width:728px;height:90px" data-ad-client="ca-pub-2153208817642134" data-ad-slot="6584603516" data-adsbygoogle-status="done"><ins id="aswift_0_expand" style="display:inline-table;border:none;height:90px;margin:0;padding:0;position:relative;visibility:visible;width:728px;background-color:transparent;"><ins id="aswift_0_anchor" style="display:block;border:none;height:90px;margin:0;padding:0;position:relative;visibility:visible;width:728px;background-color:transparent;"><iframe width="728" height="90" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" onload="var i=this.id,s=window.google_iframe_oncopy,H=s&amp;&amp;s.handlers,h=H&amp;&amp;H[i],w=this.contentWindow,d;try{d=w.document}catch(e){}if(h&amp;&amp;d&amp;&amp;(!d.body||!d.body.firstChild)){if(h.call){setTimeout(h,0)}else if(h.match){try{h=s.upd(h,i)}catch(e){}w.location.replace(h)}}" id="aswift_0" name="aswift_0" style="left:0;position:absolute;top:0;width:728px;height:90px;" src="./Bai19_files/saved_resource.html"></iframe></ins></ins></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>

</div>
</div>
<div class="mdl-grid">
<div class="mdl-cell mdl-cell--12-col  mdl-card mdl-shadow--2dp through mdl-shadow--6dp mdl-cell--hide-phone">

<p> New exercises added to: <a href="https://www.w3resource.com/ruby-exercises/">Ruby, </a><a href="https://www.w3resource.com/java-exercises/">Java, </a><a href="https://www.w3resource.com/php-exercises/">PHP, </a> <a href="https://www.w3resource.com/python-exercises/">Python, </a><a href="https://www.w3resource.com/c-programming-exercises/">C Programming, </a>
<a href="https://www.w3resource.com/graphics/matplotlib/">Matplotlib, </a><a href="https://www.w3resource.com/python-exercises/numpy/index.php">Python NumPy, </a><a href="https://www.w3resource.com/python-exercises/pandas/index.php">Python Pandas</a></p>
</div>
</div>
<div class="mdl-grid">
<div class="mdl-cell mdl-card mdl-shadow--2dp through mdl-shadow--6dp mdl-cell--2-col mdl-cell--hide-phone">
<ul class="nav nav-list"><li><a href="https://www.w3resource.com/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement">Home</a></li><li class="nav-header">▼Java Exercises</li><li><a href="https://www.w3resource.com/java-exercises/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement"> Introduction</a></li><li class="active"><a href="https://www.w3resource.com/java-exercises/basic/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement">Basic</a></li><li><a href="https://www.w3resource.com/java-exercises/datatypes/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement"> Data Types</a></li><li><a href="https://www.w3resource.com/java-exercises/conditional-statement/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement"> Conditional Statement</a></li><li><a href="https://www.w3resource.com/java-exercises/array/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement"> Array</a></li><li><a href="https://www.w3resource.com/java-exercises/string/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement"> String</a></li><li><a href="https://www.w3resource.com/java-exercises/datetime/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement"> Date Time</a></li><li><a href="https://www.w3resource.com/java-exercises/method/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement"> Method</a></li><li><a href="https://www.w3resource.com/java-exercises/numbers/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement"> Numbers</a></li><li><a href="https://www.w3resource.com/java-exercises/io/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement"> Input-Output File System</a></li><li><a href="https://www.w3resource.com/java-exercises/collection/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement"> Collection</a></li><li><a href="https://www.w3resource.com/java-exercises/math/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement"> Math</a></li><li><a href="https://www.w3resource.com/java-exercises/basic/index.php" itemscope="" itemtype="http://schema.org/WebPageElement/SiteNavigationElement"> ..More to come..</a></li></ul> </div>
<div class="mdl-cell mdl-card mdl-shadow--2dp through mdl-shadow--6dp mdl-cell--7-col">
<article itemscope="" itemtype="http://schema.org/TechArticle">
<img src="./Bai19_files/java-exercises.png" alt="Java Programming Exercises">
<h1 itemscope="" itemtype="http://schema.org/WebPageElement/Heading" class="heading" id="h_one">Java Basic Programming : Exercises, Practice, Solution</h1>
<time itemprop="dateModified" datetime="February 27 2018 12:54:51.">Last update on February 27 2018 12:54:51 (UTC/GMT +8 hours)</time>
<div class="mdl-grid">
<div class="mdl-cell mdl-cell--12-col mdl-cell--hide-phone mdl-cell--hide-tablet">
<script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>

</div>
<div class="mdl-cell mdl-cell--12-col mdl-cell--hide-desktop">
<script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>

<ins class="adsbygoogle" style="display:inline-block;width:320px;height:100px" data-ad-client="ca-pub-2153208817642134" data-ad-slot="7685555518" data-adsbygoogle-status="done"><ins id="aswift_1_expand" style="display:inline-table;border:none;height:100px;margin:0;padding:0;position:relative;visibility:visible;width:320px;background-color:transparent;"><ins id="aswift_1_anchor" style="display: block; border: none; height: 100px; margin: 0px; padding: 0px; position: relative; visibility: visible; width: 320px; background-color: transparent; overflow: visible; opacity: 1;"><iframe width="320" height="100" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" onload="var i=this.id,s=window.google_iframe_oncopy,H=s&amp;&amp;s.handlers,h=H&amp;&amp;H[i],w=this.contentWindow,d;try{d=w.document}catch(e){}if(h&amp;&amp;d&amp;&amp;(!d.body||!d.body.firstChild)){if(h.call){setTimeout(h,0)}else if(h.match){try{h=s.upd(h,i)}catch(e){}w.location.replace(h)}}" id="aswift_1" name="aswift_1" style="left:0;position:absolute;top:0;width:320px;height:100px;" src="./Bai19_files/saved_resource(3).html"></iframe></ins></ins></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div>
</div>
<h2>Java Basic Exercises [117 exercises with solution]</h2>
<p class="heading">[<em>An editor is available at the bottom of the page to write and execute the scripts.</em>] </p>
<p><strong>1.</strong> Write a Java program to print 'Hello' on screen and then print your name on a separate line. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Expected Output</em> :<br>
Hello
<br>
Alexandra Abramov</p>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-1.php" target="_blank">Click me to see the solution</a></p>
<p><strong>2.</strong> Write a Java program to print the sum of two numbers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Test Data: <br>
74 + 36 <br>
<em>Expected Output</em> :<br>
110</p>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-2.php" target="_blank">Click me to see the solution</a></p>
<p><strong>3.</strong> Write a Java program to divide two numbers and print on the screen. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Test Data : <br>
50/3<br>
<em>Expected Output</em> :<br>
16</p>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-3.php" target="_blank">Click me to see the solution</a></p>
<p><strong>4.</strong> Write a Java program to print the result of the following operations. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Test Data:</em><br>
a. -5 + 8 * 6<br>
b. (55+9) % 9 <br>
c. 20 + -3*5 / 8 <br>
d. 5 + 15 / 3 * 2 - 8 % 3 <br>
<em>Expected Output</em> :<br>
43 <br>
1 <br>
19 <br>
13</p>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-4.php" target="_blank">Click me to see the solution</a></p>
<p><strong>5.</strong> Write a Java program that takes two numbers as input and display the product of two numbers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Test Data:</em><br>
Input first number: 25<br>
Input second number: 5<br> 
<em>Expected Output</em> :<br>
25 x 5 = 125</p>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-5.php" target="_blank">Click me to see the solution</a></p>
<p><strong>6.</strong> Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Test Data:</em><br>
Input first number: 125<br>
Input second number: 24<br>
<em>Expected Output</em> :<br>
125 + 24 = 149<br>
125 - 24 = 101<br>
125 x 24 = 3000<br>
125 / 24 = 5<br>
125 mod 24 = 5</p>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-6.php" target="_blank">Click me to see the solution</a></p>
<p><strong>7.</strong> Write a Java program that takes a number as input and prints its multiplication table upto 10. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Test Data:</em><br>
Input a number: 8<br>
<em>Expected Output</em> :<br>
8 x 1 = 8<br>
8 x 2 = 16<br>
8 x 3 = 24<br>
...<br>
8 x 10 = 80</p>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-7.php" target="_blank"> Click me to see the solution</a></p>
<p><strong>8.</strong> Write a Java program to display the following pattern. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Pattern : </em></p>
<pre>   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
 </pre>
<p> <a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-8.php" target="_blank">Click me to see the solution</a></p>
<p><strong>9.</strong> Write a Java program to compute the specified expressions and print the output. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Test Data:</em><br>
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
<br>
<em>Expected Output</em><br>
2.138888888888889</p>
<p> <a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-9.php" target="_blank">Click me to see the solution</a></p>
<p></p>
<p>
<script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>
<ins class="adsbygoogle" style="display: block; text-align: center; height: 200px;" data-ad-format="fluid" data-ad-layout="in-article" data-ad-client="ca-pub-2153208817642134" data-ad-slot="1566153117" data-adsbygoogle-status="done"><ins id="aswift_2_expand" style="display:inline-table;border:none;height:200px;margin:0;padding:0;position:relative;visibility:visible;width:882px;background-color:transparent;"><ins id="aswift_2_anchor" style="display:block;border:none;height:200px;margin:0;padding:0;position:relative;visibility:visible;width:882px;background-color:transparent;"><iframe width="882" height="200" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" onload="var i=this.id,s=window.google_iframe_oncopy,H=s&amp;&amp;s.handlers,h=H&amp;&amp;H[i],w=this.contentWindow,d;try{d=w.document}catch(e){}if(h&amp;&amp;d&amp;&amp;(!d.body||!d.body.firstChild)){if(h.call){setTimeout(h,0)}else if(h.match){try{h=s.upd(h,i)}catch(e){}w.location.replace(h)}}" id="aswift_2" name="aswift_2" style="left:0;position:absolute;top:0;width:882px;height:200px;" src="./Bai19_files/saved_resource(4).html"></iframe></ins></ins></ins>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({});
</script></p>
<p></p>
<p><strong>10.</strong> Write a Java program to compute a specified formula. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Specified Formula :</em>
<br>
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))<br>
<em>Expected Output</em><br>
2.9760461760461765</p>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-10.php" target="_blank">Click me to see the solution</a></p>
<p><strong>11.</strong> Write a Java program to print the area and perimeter of a circle. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Test Data:</em><br>
Radius = 7.5 <br>
<em>Expected Output</em><br>
Perimeter is = 47.12388980384689 <br>
Area is = 176.71458676442586 </p>
<p> <a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-11.php" target="_blank">Click me to see the solution</a></p>
<p><strong>12.</strong> Write a Java program that takes three numbers as input to calculate and print the average of the numbers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-12.php" target="_blank">Click me to see the solution</a></p>
<p><strong>13.</strong> Write a Java program to print the area and perimeter of a rectangle. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Test Data:</em><br>
Width = 5.5
Height = 8.5 </p>
<p><em>Expected Output</em><br>
Area is 5.6 * 8.5 = 47.60<br>
Perimeter is 2 * (5.6 + 8.5) = 28.20 </p>
<p> <a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-13.php" target="_blank">Click me to see the solution</a></p>
<p><strong>14.</strong> Write a Java program to print an American flag on the screen. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Expected Output</em></p>
<pre>* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================
 </pre>
<p> <a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-14.php" target="_blank">Click me to see the solution</a></p>
<p><strong>15.</strong> Write a Java program to swap two variables. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-15.php" target="_blank">Click me to see the solution</a></p>
<p><strong>16.</strong> Write a Java program to print a face. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Expected Output</em></p>
<pre> +"""""+                                                 
[| o o |]                                                
 |  ^  |                                                 
 | '-' |                                                 
 +-----+
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-16.php" target="_blank">Click me to see the solution</a></p>
<p><strong>17.</strong> Write a Java program to add two binary numbers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input first binary number: 10 <br>
Input second binary number: 11<br>
<em>Expected Output</em></p>
<pre>Sum of two binary numbers: 101
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-17.php" target="_blank">Click me to see the solution</a></p>
<p><strong>18.</strong> Write a Java program to multiply two binary numbers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input the first binary number: 10 <br>
Input the second binary number: 11 <br>
<em>Expected Output</em></p>
<pre>Product of two binary numbers: 110 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-18.php" target="_blank">Click me to see the solution</a></p>
<p><strong>19.</strong> Write a Java program to convert a decimal number to binary number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input a Decimal Number : 5<br>
<em>Expected Output</em></p>
<pre>Binary number is: 101 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-19.php" target="_blank">Click me to see the solution</a></p>
<p><strong>20.</strong> Write a Java program to convert a decimal number to hexadecimal number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input a decimal number: 15<br>
<em>Expected Output</em></p>
<pre>Hexadecimal number is : F 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-20.php" target="_blank">Click me to see the solution</a></p>
<p><strong>21.</strong> Write a Java program to convert a decimal number to octal number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input a Decimal Number: 15 <br>
<em>Expected Output</em></p>
<pre>Octal number is: 17  
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-21.php" target="_blank">Click me to see the solution</a></p>
<p><strong>22.</strong> Write a Java program to convert a binary number to decimal number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input a binary number: 100<br>
<em>Expected Output</em></p>
<pre>Decimal Number: 4 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-22.php" target="_blank">Click me to see the solution</a></p>
<p><strong>23.</strong> Write a Java program to convert a binary number to hexadecimal number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input a Binary Number: 1101 <br>
<em>Expected Output</em></p>
<pre>HexaDecimal value: D
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-23.php" target="_blank">Click me to see the solution</a></p>
<p><strong>24.</strong> Write a Java program to convert a binary number to a Octal number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input a Binary Number: 111 <br>
<em>Expected Output</em></p>
<pre>Octal number: 7 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-24.php" target="_blank">Click me to see the solution</a></p>
<p><strong>25.</strong> Write a Java program to convert a octal number to a decimal number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input any octal number: 10 <br>
<em>Expected Output</em></p>
<pre>Equivalent decimal number: 8
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-25.php" target="_blank">Click me to see the solution</a></p>
<p><strong>26.</strong> Write a Java program to convert a octal number to a binary number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input any octal number: 7 <br>
<em>Expected Output</em></p>
<pre>Equivalent binary number: 111 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-26.php" target="_blank">Click me to see the solution</a></p>
<p><strong>27.</strong> Write a Java program to convert a octal number to a hexadecimal number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input a octal number : 100 <br>
<em>Expected Output</em></p>
<pre>Equivalent hexadecimal number: 40
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-27.php" target="_blank">Click me to see the solution</a></p>
<p><strong>28.</strong> Write a Java program to convert a hexadecimal to a decimal number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input a hexadecimal number: 25<br>
<em>Expected Output</em></p>
<pre>Equivalent decimal number is: 37
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-28.php" target="_blank">Click me to see the solution</a></p>
<p><strong>29.</strong> Write a Java program to convert a hexadecimal to a binary number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Enter Hexadecimal Number : 37<br>
<em>Expected Output</em></p>
<pre>Equivalent Binary Number is: 110111
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-29.php" target="_blank">Click me to see the solution</a></p>
<p></p>
<p>
<script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>
<ins class="adsbygoogle" style="display: block; text-align: center; height: 200px;" data-ad-format="fluid" data-ad-layout="in-article" data-ad-client="ca-pub-2153208817642134" data-ad-slot="4519619511" data-adsbygoogle-status="done"><ins id="aswift_3_expand" style="display:inline-table;border:none;height:200px;margin:0;padding:0;position:relative;visibility:visible;width:882px;background-color:transparent;"><ins id="aswift_3_anchor" style="display:block;border:none;height:200px;margin:0;padding:0;position:relative;visibility:visible;width:882px;background-color:transparent;"><iframe width="882" height="200" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" onload="var i=this.id,s=window.google_iframe_oncopy,H=s&amp;&amp;s.handlers,h=H&amp;&amp;H[i],w=this.contentWindow,d;try{d=w.document}catch(e){}if(h&amp;&amp;d&amp;&amp;(!d.body||!d.body.firstChild)){if(h.call){setTimeout(h,0)}else if(h.match){try{h=s.upd(h,i)}catch(e){}w.location.replace(h)}}" id="aswift_3" name="aswift_3" style="left:0;position:absolute;top:0;width:882px;height:200px;" src="./Bai19_files/saved_resource(5).html"></iframe></ins></ins></ins>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({});
</script>
</p>
<p></p>
<p><strong>30.</strong> Write a Java program to convert a hexadecimal to a octal number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input a hexadecimal number: 40<br>
<em>Expected Output</em></p>
<pre>Equivalent of octal number is: 100 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-30.php" target="_blank">Click me to see the solution</a></p>
<p><strong>31.</strong> Write a Java program to check whether Java is installed on your computer. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Expected Output</em></p>
<pre>Java Version: 1.8.0_71                                                            
Java Runtime Version: 1.8.0_71-b15                                                
Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
Java Vendor: Oracle Corporation                                                   
Java Vendor URL: http://Java.oracle.com/                                          
Java Class Path: .
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-31.php" target="_blank">Click me to see the solution</a></p>
<p><strong>32.</strong> Write a Java program to compare two numbers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input first integer: 25<br>
Input second integer: 39<br>
<em>Expected Output</em></p>
<pre>25 != 39                                                                          
25 &lt; 39                                                                           
25 &lt;= 39
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-32.php" target="_blank">Click me to see the solution</a></p>
<p><strong>33.</strong> Write a Java program and compute the sum of the digits of an integer. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input an integer: 25<br>
<em>Expected Output</em></p>
<pre>The sum of the digits is: 7
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-33.php" target="_blank">Click me to see the solution</a></p>
<p><strong>34.</strong> Write a Java program to compute the area of a hexagon. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Area of a hexagon = (6 * s^2)/(4*tan(π/6))<br>
where s is the length of a side<br>
Input Data:<br>
Input the length of a side of the hexagon: 6<br>
<em>Expected Output</em></p>
<pre>The area of the hexagon is: 93.53074360871938
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-34.php" target="_blank">Click me to see the solution</a></p>
<p><strong>35.</strong> Write a Java program to compute the area of a polygon. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Area of a polygon = (n*s^2)/(4*tan(π/n))<br>
where n is n-sided polygon and s is the length of a side<br>
Input Data:<br>
Input the number of sides on the polygon: 7<br>
Input the length of one of the sides: 6<br>
<em>Expected Output</em></p>
<pre>The area is: 130.82084798405722
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-35.php" target="_blank">Click me to see the solution</a></p>
<p><strong>36.</strong> Write a Java program to compute the distance between two points on the surface of earth. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Distance between the two points [ (x1,y1) &amp; (x2,y2)]<br>
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))<br>
Radius of the earth r = 6371.01 Kilometers<br>
Input Data:<br>
Input the latitude of coordinate 1: 25 <br>
Input the longitude of coordinate 1: 35<br>
Input the latitude of coordinate 2: 35.5<br>
Input the longitude of coordinate 2: 25.5<br>
<em>Expected Output</em></p>
<pre style="overflow: scroll">The distance between those points is: 1480.0848451069087 km 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-36.php" target="_blank">Click me to see the solution</a></p>
<p><strong>37.</strong> Write a Java program to reverse a string. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input Data:<br>
Input a string: The quick brown fox <br>
<em>Expected Output</em></p>
<pre>Reverse string: xof nworb kciuq ehT
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-37.php" target="_blank">Click me to see the solution</a></p>
<p><strong>38.</strong> Write a Java program to count the letters, spaces, numbers and other characters of an input string. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Expected Output</em></p>
<pre style="overflow: scroll">The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-38.php" target="_blank">Click me to see the solution</a></p>
<p><strong>39.</strong> Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Expected Output</em></p>
<pre>123                                                      
124                                                      
...                                            
                                                   
431                                                      
432                                                      
Total number of the three-digit-number is 24
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-39.php" target="_blank">Click me to see the solution</a></p>
<p><strong>40.</strong> Write a Java program to list the available character sets in charset objects. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Expected Output</em></p>
<pre>List of available character sets:                                       
Big5                                                                    
Big5-HKSCS                                                              
CESU-8                                                                  
EUC-JP                                                                  
EUC-KR                                                                  
GB18030                                                                 
GB2312                                                                  
GBK                                                                     
                                                     
...                                            
                                                   
x-SJIS_0213                                                             
x-UTF-16LE-BOM                                                          
X-UTF-32BE-BOM                                                          
X-UTF-32LE-BOM                                                          
x-windows-50220                                                         
x-windows-50221                                                         
x-windows-874                                                           
x-windows-949                                                           
x-windows-950                                                           
x-windows-iso2022jp
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-40.php" target="_blank">Click me to see the solution</a></p>
<p><strong>41.</strong> Write a Java program to print the ascii value of a given character. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Expected Output</em></p>
<pre>The ASCII value of Z is :90
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-41.php" target="_blank">Click me to see the solution</a></p>
<p><strong>42.</strong> Write a Java program to input and display your password. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Expected Output</em></p>
<pre>Input your Password:                                                    
Your password was: abc@123
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-42.php" target="_blank">Click me to see the solution</a></p>
<p><strong>43.</strong> Write a Java program to print the following string in a specific format (see the output). <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output</em></p>
<pre>Twinkle, twinkle, little star,
	How I wonder what you are! 
		Up above the world so high,   		
		Like a diamond in the sky. 
Twinkle, twinkle, little star, 
	How I wonder what you are
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-43.php" target="_blank">Click me to see the solution</a></p>
<p><strong>44.</strong> Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Input number: 5                                                        
5 + 55  + 555
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-44.php" target="_blank">Click me to see the solution</a></p>
<p><strong>45.</strong> Write a Java program to find the size of a specified file. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>/home/students/abc.txt  : 0 bytes                                      
/home/students/test.txt : 0 bytes 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-45.php" target="_blank">Click me to see the solution</a></p>
<p><strong>46.</strong> Write a Java program to display the system time. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Current Date time: Fri Jun 16 14:17:40 IST 2017 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-46.php" target="_blank">Click me to see the solution</a></p>
<p><strong>47.</strong> Write a Java program to display the current date time in specific format. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Now: 2017/06/16 08:52:03.066 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-47.php" target="_blank">Click me to see the solution</a></p>
<p><strong>48.</strong> Write a Java program to print the odd numbers from 1 to 99. Prints one number per line. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>1                                                                      
3                                                                      
5                                                                      
7                                                                      
9                                                                      
11                                                                     
....                                                                     
                                                                    
91                                                                     
93                                                                     
95                                                                     
97                                                                     
99 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-48.php" target="_blank">Click me to see the solution</a></p>
<p><strong>49.</strong> Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Input a number: 20                                                     
1
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-49.php" target="_blank">Click me to see the solution</a></p>
<p><strong>50.</strong> Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre style="overflow: scroll">Divided by 3:                                                          
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              
                                                                       
Divided by 5:                                                          
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 
95,                                                                    
                                                                       
Divided by 3 &amp; 5:                                                      
15, 30, 45, 60, 75, 90,
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-50.php" target="_blank">Click me to see the solution</a></p>
<p><strong>51.</strong> Write a Java program to convert a string to an integer in Java. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Input a number(string): 25                                             
The integer value is: 25
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-51.php" target="_blank">Click me to see the solution</a></p>
<p><strong>52.</strong> Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-52.php" target="_blank">Click me to see the solution</a></p>
<p><strong>53.</strong> Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-53.php" target="_blank">Click me to see the solution</a></p>
<p><strong>54.</strong> Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-54.php" target="_blank">Click me to see the solution</a></p>
<p><strong>55.</strong> Write a Java program to convert seconds to hour, minute and seconds. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Input seconds: 86399                                                   
23:59:59
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-55.php" target="_blank">Click me to see the solution</a></p>
<p><strong>56.</strong> Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }<br>
<em>Sample Output: </em></p>
<pre>5
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-56.php" target="_blank">Click me to see the solution</a></p>
<p><strong>57.</strong> Write a Java program to accepts an integer and count the factors of the number. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Input an integer: 25                                                   
3
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-57.php" target="_blank">Click me to see the solution</a></p>
<p><strong>58.</strong> Write a Java program to capitalize the first letter of each word in a sentence. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre style="overflow: scroll">Input a Sentence: the quick brown fox jumps over the lazy dog.         
The Quick Brown Fox Jumps Over The Lazy Dog.
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-58.php" target="_blank">Click me to see the solution</a></p>
<p><strong>59.</strong> Write a Java program to convert a given string into lowercase. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre style="overflow: scroll">Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.           
the quick brown fox jumps over the lazy dog.
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-59.php" target="_blank">Click me to see the solution</a></p>
<p></p>
<p>
<script data-cfasync="false" src="./Bai19_files/email-decode.min.js.tải xuống"></script><script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>
<ins class="adsbygoogle" style="display: block; text-align: center; height: 200px;" data-ad-format="fluid" data-ad-layout="in-article" data-ad-client="ca-pub-2153208817642134" data-ad-slot="5996352715" data-adsbygoogle-status="done"><ins id="aswift_4_expand" style="display:inline-table;border:none;height:200px;margin:0;padding:0;position:relative;visibility:visible;width:882px;background-color:transparent;"><ins id="aswift_4_anchor" style="display:block;border:none;height:200px;margin:0;padding:0;position:relative;visibility:visible;width:882px;background-color:transparent;"><iframe width="882" height="200" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" onload="var i=this.id,s=window.google_iframe_oncopy,H=s&amp;&amp;s.handlers,h=H&amp;&amp;H[i],w=this.contentWindow,d;try{d=w.document}catch(e){}if(h&amp;&amp;d&amp;&amp;(!d.body||!d.body.firstChild)){if(h.call){setTimeout(h,0)}else if(h.match){try{h=s.upd(h,i)}catch(e){}w.location.replace(h)}}" id="aswift_4" name="aswift_4" style="left:0;position:absolute;top:0;width:882px;height:200px;" src="./Bai19_files/saved_resource(6).html"></iframe></ins></ins></ins>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({});
</script>
</p>
<p></p>
<p><strong>60.</strong> Write a Java program to find the penultimate (next to last) word of a sentence. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre style="overflow: scroll">Input a String: The quick brown fox jumps over the lazy dog.
Penultimate word: lazy
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-60.php" target="_blank">Click me to see the solution</a></p>
<p><strong>61.</strong> Write a Java program to reverse a word. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Input a word: dsaf
Reverse word: fasd
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-61.php" target="_blank">Click me to see the solution</a></p>
<p><strong>62.</strong> Write a Java program that accepts three integer values and return true if one of them is 20 or more less than one of the others. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Input the first number : 15                                            
Input the second number: 20                                            
Input the third number : 25                                            
false
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-62.php" target="_blank">Click me to see the solution</a></p>
<p><strong>63.</strong> Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Input the first number : 12                                            
Input the second number: 13                                            
Result: 13
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-63.php" target="_blank">Click me to see the solution</a></p>
<p><strong>64.</strong> Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Input the first number : 35                                            
Input the second number: 45                                            
Result: true
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-64.php" target="_blank">Click me to see the solution</a></p>
<p><strong>65.</strong> Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Input the first number : 19                                            
Input the second number: 7                                             
5   
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-65.php" target="_blank">Click me to see the solution</a></p>
<p><strong>66.</strong> Write a Java program to compute the sum of the first 100 prime numbers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Sum of the first 100 prime numbers: 24133 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-66.php" target="_blank">Click me to see the solution</a></p>
<p><strong>67.</strong> Write a Java program to insert a word in the middle of the another string. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0<br>
<em>Sample Output: </em></p>
<pre>Python Tutorial 3.0
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-67.php" target="_blank">Click me to see the solution</a></p>
<p><strong>68.</strong> Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. The length of the original string must be 3 and above. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>3.03.03.03.0 
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-68.php" target="_blank">Click me to see the solution</a></p>
<p><strong>69.</strong> Write a Java program to extract the first half of a string of even length. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Test Data: Python<br>
<em>Sample Output: </em><br>
</p><pre>Pyt</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-69.php" target="_blank">Click me to see the solution</a></p>
<p><strong>70.</strong> Write a Java program to create a string in the form short_string + long_string + short_string from two strings. The strings must not have the same length. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Test Data: Str1 = Python<br>
Str2 = Tutorial<br>
<em>Sample Output: </em></p>
<pre>PythonTutorialPython</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-70.php" target="_blank">Click me to see the solution</a></p>
<p><strong>71.</strong> Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Test Data: Str1 = Python<br>
Str2 = Tutorial<br>
<em>Sample Output: </em></p>
<pre>ythonutorial</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-71.php" target="_blank">Click me to see the solution</a></p>
<p><strong>72.</strong> Write a Java program to create a new string taking first three characters from a given string. If the length of the given string is less than 3 use "#" as substitute characters. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Test Data: Str1 = " "<br>
<em>Sample Output: </em></p>
<pre>###</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-72.php" target="_blank">Click me to see the solution</a></p>
<p><strong>73.</strong> Write a Java program to create a new string taking first and last characters from two given strings. If the length of either string is 0 use "#" for missing character. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Test Data: str1 = "Python"<br>
str2 = " "<br>
<em>Sample Output: </em></p>
<pre>P#</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-73.php" target="_blank">Click me to see the solution</a></p>
<p><strong>74.</strong> Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em><br>
Test Data: array = 10, -20, 0, 30, 40, 60, 10</p>
<pre>true</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-74.php" target="_blank">Click me to see the solution</a></p>
<p><strong>75.</strong> Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Test Data: array = 50, -20, 0, 30, 40, 60, 10<br>
<em>Sample Output: </em></p>
<pre>false</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-75.php" target="_blank">Click me to see the solution</a></p>
<p><strong>76.</strong> Write a Java program to test if the first and the last element of two array of integers are same. The length of the array must be greater than or equal to 2. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>Test Data: array1 = 50, -20, 0, 30, 40, 60, 12<br>
array2 = 45, 20, 10, 20, 30, 50, 11<br>
<em>Sample Output: </em></p>
<pre>false</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-76.php" target="_blank">Click me to see the solution</a></p>
<p><strong>77.</strong> Write a Java program to create a new array of length 2 from two arrays of integers with three elements and the new array will contain the first and last elements from the two arrays. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Test Data: array1 = 50, -20, 0<br>
array2 = 5, -50, 10<br>
<em>Sample Output: </em></p>
<pre>Array1: [50, -20, 0]                                                   
Array2: [5, -50, 10]                                                   
New Array: [50, 10]</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-77.php" target="_blank">Click me to see the solution</a></p>
<p><strong>78.</strong> Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Original Array: [5, 7]                                                 
true </pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-78.php" target="_blank">Click me to see the solution</a></p>
<p><strong>79.</strong> Write a Java program to rotate an array (length 3) of integers in left direction. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Original Array: [20, 30, 40]                                           
Rotated Array: [30, 40, 20]</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-79.php" target="_blank">Click me to see the solution</a></p>
<p><strong>80.</strong> Write a Java program to get the larger value between first and last element of an array (length 3) of integers . <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre style="overflow: scroll">Original Array: [20, 30, 40]                                           
Larger value between first and last element: 40 </pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-80.php" target="_blank">Click me to see the solution</a></p>
<p><strong>81.</strong> Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre style="overflow: scroll">Original Array: [20, 30, 40]                                           
New array after swaping the first and last elements: [40, 30, 20] </pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-81.php" target="_blank">Click me to see the solution</a></p>
<p><strong>82.</strong> Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length). <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre style="overflow: scroll">Original Array: [20, 30, 40, 50, 67]                                   
Largest element between first, last, and middle values: 67 </pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-82.php" target="_blank">Click me to see the solution</a></p>
<p><strong>83.</strong> Write a Java program to multiply corresponding elements of two arrays of integers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<em>Sample Output: </em></p>
<pre>Array1: [1, 3, -5, 4]                                                  
                                                                       
Array2: [1, 4, -5, -2]                                                 
                                                                       
Result: 1 12 25 -8</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-83.php" target="_blank">Click me to see the solution</a></p>
<p><strong>84.</strong> Write a Java program to take the last three characters from a given string and add the three characters at both the front and back of the string. String length must be greater than three and more. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Test data: "Python" will be "honPythonhon"<br>
<em>Sample Output: </em></p>
<pre>PyPythonPy</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-84.php" target="_blank">Click me to see the solution</a></p>
<p><strong>85.</strong> Write a Java program to check if a string starts with a specified word. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>Sample Data: string1 = "Hello how are you?"<br>
<em>Sample Output: </em></p>
<pre class="output">true
</pre>
<p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-85.php" target="_blank">Click me to see the solution</a></p>
<p><strong>86.</strong> Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
</p><p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-86.php" target="_blank">Click me to see the solution</a></p>
<p><strong>87.</strong> Write a Java program than read an integer and calculate the sum of its digits and write the number of each digit of the sum in English. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
</p><p><a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-87.php" target="_blank">Click me to see the solution</a></p>
<p><strong>88.</strong> Write a Java program to get the current system environment and system properties. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-88.php" target="_blank">Click me to see the solution</a></p>
<p><strong>89.</strong> Write a Java program to check whether a security manager has already been established for the current application or not. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-89.php" target="_blank">Click me to see the solution</a></p>
<p><strong>90.</strong> Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-90.php" target="_blank">Click me to see the solution</a></p>
<p><strong>91.</strong> Write a Java program to measure how long some code takes to execute in nanoseconds. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-91.php" target="_blank">Click me to see the solution</a></p>
<p><strong>92.</strong> Write a Java program to count the number of even and odd elements in a given array of integers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-92.php" target="_blank">Click me to see the solution</a></p>
<p><strong>93.</strong> Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-93.php" target="_blank">Click me to see the solution</a></p>
<p><strong>94.</strong> Write a Java program to rearrange all the elements of an given array of integers so that all the odd numbers come before all the even numbers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-94.php" target="_blank">Click me to see the solution</a></p>
<p><strong>95.</strong> Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-95.php" target="_blank">Click me to see the solution</a></p>
<p><strong>96.</strong> Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-96.php" target="_blank">Click me to see the solution</a></p>
<p><strong>97.</strong> Write a Java program to check if an array of integers contains a specified number next to each other or there are two same specified numbers separated by one element. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-97.php" target="_blank">Click me to see the solution</a></p>
<p><strong>98.</strong> Write a Java program to check if the value 20 appears three times and no 20's are next to each other in an given array of integers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-98.php" target="_blank">Click me to see the solution</a></p>
<p><strong>99.</strong> Write a Java program to check if a specified number appears in every pair of adjacent element of a given array of integers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-99.php" target="_blank">Click me to see the solution</a></p>
<p><strong>100.</strong> Write a Java program to count the two elements differ by 1 or less of two given arrays of integers with same length. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-100.php" target="_blank">Click me to see the solution</a></p>
<p><strong>101.</strong> Write a Java program to check if the number of 10 is greater than number to 20's in a given array of integers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-101.php" target="_blank">Click me to see the solution</a></p>
<p><strong>102.</strong> Write a Java program to check if a specified array of integers contains 10's or 30's. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-102.php" target="_blank">Click me to see the solution</a></p>
<p><strong>103.</strong> Write a Java program to create a new array from a given array of integers, new array will contain the elements from the given array after the last element value 10. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-103.php" target="_blank">Click me to see the solution</a></p>
<p><strong>104.</strong> Write a Java program to create a new array from a given array of integers, new array will contain the elements from the given array before the last element value 10. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-104.php" target="_blank">Click me to see the solution</a></p>
<p><strong>105.</strong> Write a Java program to check if a group of numbers (l) at the start and end of a given array are same. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-105.php" target="_blank">Click me to see the solution</a></p>
<p><strong>106.</strong> Write a Java program to create a new array that is left shifted from a given array of integers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-106.php" target="_blank">Click me to see the solution</a></p>
<p><strong>107.</strong> Write a Java program to check if an array of integers contains three increasing adjacent numbers. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-107.php" target="_blank">Click me to see the solution</a></p>
<p><strong>108.</strong> Write a Java program to add all the digits of a given positive integer until the result has a single digit. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-108.php" target="_blank">Click me to see the solution</a></p>
<p><strong>109.</strong> Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-109.php" target="_blank">Click me to see the solution</a></p>
<p><strong>110.</strong> Write a Java program to check whether an given integer is a power of 4 or not. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Given num = 64, return true. Given num = 6, return false.<br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-110.php" target="_blank">Click me to see the solution</a></p>
<p><strong>111.</strong> Write a Java program to add two numbers without using any arithmetic operators. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>Given x = 10 and y = 12; result = 22<br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-111.php" target="_blank">Click me to see the solution</a></p>
<p><strong>112.</strong> Write a Java program to compute the number of trailing zeros in a factorial. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>7! = 5040, therefore the output should be 1<br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-112.php" target="_blank">Click me to see the solution</a></p>
<p><strong>113.</strong> Write a Java program to merge two given sorted array of integers and create a new sorted array. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>array1 = [1,2,3,4]<br>
array2 = [2,5,7, 8]<br>
result = [1,2,2,3,4,5,7,8]<br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-113.php" target="_blank">Click me to see the solution</a></p>
<p><strong>114.</strong> Write a Java program to given a string and an offset, rotate string by offset (rotate from left to right). <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-114.php" target="_blank">Click me to see the solution</a></p>
<p><strong>115.</strong> Write a Java program to check if a positive number is a palindrome or not. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
Input a positive integer: 151 <br>
Is 151 is a palindrome number? <br>
true<br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-115.php" target="_blank">Click me to see the solution</a></p>
<p><strong>116.</strong> Write a Java program which iterates the integers from 1 to 100. For multiples of three print "Fizz" instead of the number and print "Buzz" for the multiples of five. When number is divided by both three and five, print "fizz buzz". <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-116.php" target="_blank">Click me to see the solution</a></p>
<p><strong>117.</strong> Write a Java program to compute the square root of an given integer. <a href="https://www.w3resource.com/java-exercises/basic/index.php#editorr">Go to the editor</a><br>Input a positive integer: 25<br>
Square root of 25 is: 5 <br>
<a href="https://www.w3resource.com/java-exercises/basic/java-basic-exercise-117.php" target="_blank">Click me to see the solution</a></p>

<p id="editorr"><strong>Java Code Editor:</strong></p>
<p>
<iframe src="./Bai19_files/d1fcaa7e44.html" width="100%" height="600" frameborder="0" marginwidth="0" marginheight="0" allowfullscreen=""></iframe></p>
<p class="style2"><strong>More to Come !</strong></p>
<p class="style2"><strong>Do not submit any solution of the above exercises at here, if you want to contribute go to the appropriate exercise page.</strong></p>
</article>
﻿<style type="text/css">
.notes {
margin-left:20%
}
.notes a {
color: #e51cc9	
}
</style>
<p class="notes"><a href="https://goo.gl/forms/WdU5vlk4PeMKs4bi1" target="_blank">Help us improve w3resource. Please take this survey.</a></p>
<hr class="w3r_hr">
<div class="mdl-grid">

<div id="bottom_ad_zero_google" class="mdl-cell mdl-cell--6-col mdl-cell--hide-phone">


<script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>

<ins class="adsbygoogle" style="display: inline-block; width: 300px; height: 250px;" data-ad-client="ca-pub-2153208817642134" data-ad-slot="4616214717" data-adsbygoogle-status="done"><ins id="aswift_5_expand" style="display:inline-table;border:none;height:250px;margin:0;padding:0;position:relative;visibility:visible;width:300px;background-color:transparent;"><ins id="aswift_5_anchor" style="display:block;border:none;height:250px;margin:0;padding:0;position:relative;visibility:visible;width:300px;background-color:transparent;"><iframe width="300" height="250" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" onload="var i=this.id,s=window.google_iframe_oncopy,H=s&amp;&amp;s.handlers,h=H&amp;&amp;H[i],w=this.contentWindow,d;try{d=w.document}catch(e){}if(h&amp;&amp;d&amp;&amp;(!d.body||!d.body.firstChild)){if(h.call){setTimeout(h,0)}else if(h.match){try{h=s.upd(h,i)}catch(e){}w.location.replace(h)}}" id="aswift_5" name="aswift_5" style="left:0;position:absolute;top:0;width:300px;height:250px;" src="./Bai19_files/saved_resource(7).html"></iframe></ins></ins></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>

</div>
<div id="bottom_ad_one_amazon-cpm" class="mdl-cell mdl-cell--6-col mdl-cell--hide-phone">
<script type="text/javascript" language="javascript" src="./Bai19_files/getads.js.tải xuống"></script>
<script type="text/javascript" language="javascript">
  //<![CDATA[
    aax_getad_mpb({
      "slot_uuid":"e0a1a470-d3e8-45e4-a0fa-fdf2a8cac69e"
    });
  //]]>
</script><script src="./Bai19_files/getad(1)"></script><script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>
<!-- 300X250_bellow_content -->
<ins class="adsbygoogle" style="display: inline-block; width: 300px; height: 250px;" data-ad-client="ca-pub-2153208817642134" data-ad-slot="4616214717" data-adsbygoogle-status="done"><ins id="aswift_6_expand" style="display:inline-table;border:none;height:250px;margin:0;padding:0;position:relative;visibility:visible;width:300px;background-color:transparent;"><ins id="aswift_6_anchor" style="display:block;border:none;height:250px;margin:0;padding:0;position:relative;visibility:visible;width:300px;background-color:transparent;"><iframe width="300" height="250" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" onload="var i=this.id,s=window.google_iframe_oncopy,H=s&amp;&amp;s.handlers,h=H&amp;&amp;H[i],w=this.contentWindow,d;try{d=w.document}catch(e){}if(h&amp;&amp;d&amp;&amp;(!d.body||!d.body.firstChild)){if(h.call){setTimeout(h,0)}else if(h.match){try{h=s.upd(h,i)}catch(e){}w.location.replace(h)}}" id="aswift_6" name="aswift_6" style="left:0;position:absolute;top:0;width:300px;height:250px;" src="./Bai19_files/saved_resource(8).html"></iframe></ins></ins></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div>
</div>

<div id="bottom_ad_zero_amazon" class="mdl-cell mdl-cell--hide-desktop">
<script type="text/javascript" language="javascript" src="./Bai19_files/getads.js.tải xuống"></script>
<script type="text/javascript" language="javascript">
  //<![CDATA[
   aax_getad_mpb({
      "slot_uuid":"6a527ea5-0510-4a70-af94-358c7bda61b8"
    });
  //]]>
</script><script src="./Bai19_files/getad(2)"></script><script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>
<!-- responsive_bellow_content -->
<ins class="adsbygoogle" style="display:block" data-ad-client="ca-pub-2153208817642134" data-ad-slot="9162288711" data-ad-format="auto" data-adsbygoogle-status="done"></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div>
<div id="disqus_thread"><iframe id="dsq-app4925" name="dsq-app4925" allowtransparency="true" frameborder="0" scrolling="no" tabindex="0" title="Disqus" width="100%" src="./Bai19_files/saved_resource(9).html" style="width: 1px !important; min-width: 100% !important; border: none !important; overflow: hidden !important; height: 2226px !important;" horizontalscrolling="no" verticalscrolling="no"></iframe></div>
<div id="disqus_thread" itemscope="" itemtype="http://schema.org/CreativeWork/Comment"></div>
<script type="text/javascript">
    /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
    var disqus_shortname = 'w3r'; // required: replace example with your forum shortname

    // The following are highly recommended additional parameters. Remove the slashes in front to use.
    // var disqus_identifier = 'unique_dynamic_id_1234';
    // var disqus_url = 'http://example.com/permalink-to-page.html';

    /* * * DON'T EDIT BELOW THIS LINE * * */
    (function() {
        var dsq = document.createElement('script'); dsq.type = 'text/javascript'; dsq.async = true;
        dsq.src = 'https://' + disqus_shortname + '.disqus.com/embed.js';
        (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(dsq);
    })();
</script>
<div id="bottom_ad" style="display: block; background-color:#f8f8f8; margin-top: 30px">

</div>
</div>
<div class="mdl-cell mdl-card mdl-shadow--2dp through mdl-shadow--6dp mdl-cell--3-col mdl-cell--hide-phone">
<div id="sol_ad_zero">
<script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>


<ins class="adsbygoogle" style="display:inline-block;width:300px;height:600px" data-ad-client="ca-pub-2153208817642134" data-ad-slot="6376961513" data-adsbygoogle-status="done"><ins id="aswift_7_expand" style="display:inline-table;border:none;height:600px;margin:0;padding:0;position:relative;visibility:visible;width:300px;background-color:transparent;"><ins id="aswift_7_anchor" style="display:block;border:none;height:600px;margin:0;padding:0;position:relative;visibility:visible;width:300px;background-color:transparent;"><iframe width="300" height="600" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" onload="var i=this.id,s=window.google_iframe_oncopy,H=s&amp;&amp;s.handlers,h=H&amp;&amp;H[i],w=this.contentWindow,d;try{d=w.document}catch(e){}if(h&amp;&amp;d&amp;&amp;(!d.body||!d.body.firstChild)){if(h.call){setTimeout(h,0)}else if(h.match){try{h=s.upd(h,i)}catch(e){}w.location.replace(h)}}" id="aswift_7" name="aswift_7" style="left:0;position:absolute;top:0;width:300px;height:600px;" src="./Bai19_files/saved_resource(10).html"></iframe></ins></ins></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>

</div>
<div id="sol_ad_one">
<script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>


<ins class="adsbygoogle" style="display:inline-block;width:300px;height:600px" data-ad-client="ca-pub-2153208817642134" data-ad-slot="6965701915" data-adsbygoogle-status="done"><ins id="aswift_8_expand" style="display:inline-table;border:none;height:600px;margin:0;padding:0;position:relative;visibility:visible;width:300px;background-color:transparent;"><ins id="aswift_8_anchor" style="display:block;border:none;height:600px;margin:0;padding:0;position:relative;visibility:visible;width:300px;background-color:transparent;"><iframe width="300" height="600" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" onload="var i=this.id,s=window.google_iframe_oncopy,H=s&amp;&amp;s.handlers,h=H&amp;&amp;H[i],w=this.contentWindow,d;try{d=w.document}catch(e){}if(h&amp;&amp;d&amp;&amp;(!d.body||!d.body.firstChild)){if(h.call){setTimeout(h,0)}else if(h.match){try{h=s.upd(h,i)}catch(e){}w.location.replace(h)}}" id="aswift_8" name="aswift_8" style="left:0;position:absolute;top:0;width:300px;height:600px;" src="./Bai19_files/saved_resource(11).html"></iframe></ins></ins></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>

</div>
<div id="sol_ad_two">
<script type="text/javascript" language="javascript" src="./Bai19_files/getads.js.tải xuống"></script>
<script type="text/javascript" language="javascript">
  //<![CDATA[
    aax_getad_mpb({
      "slot_uuid":"d7e99008-686f-462a-a349-68f0492859b1"
    });
  //]]>
</script><script src="./Bai19_files/getad(3)"></script><script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>
<!-- sol_ad_two -->
<ins class="adsbygoogle" style="display: block; height: 280px;" data-ad-client="ca-pub-2153208817642134" data-ad-slot="1165650718" data-ad-format="auto" data-adsbygoogle-status="done"><ins id="aswift_9_expand" style="display:inline-table;border:none;height:280px;margin:0;padding:0;position:relative;visibility:visible;width:376px;background-color:transparent;"><ins id="aswift_9_anchor" style="display:block;border:none;height:280px;margin:0;padding:0;position:relative;visibility:visible;width:376px;background-color:transparent;"><iframe width="376" height="280" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" onload="var i=this.id,s=window.google_iframe_oncopy,H=s&amp;&amp;s.handlers,h=H&amp;&amp;H[i],w=this.contentWindow,d;try{d=w.document}catch(e){}if(h&amp;&amp;d&amp;&amp;(!d.body||!d.body.firstChild)){if(h.call){setTimeout(h,0)}else if(h.match){try{h=s.upd(h,i)}catch(e){}w.location.replace(h)}}" id="aswift_9" name="aswift_9" style="left:0;position:absolute;top:0;width:376px;height:280px;" src="./Bai19_files/saved_resource(12).html"></iframe></ins></ins></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div>
<div id="sol_ad_three">
<script type="text/javascript" language="javascript" src="./Bai19_files/getads.js.tải xuống"></script>
<script type="text/javascript" language="javascript">
  //<![CDATA[
    aax_getad_mpb({
      "slot_uuid":"2fc7138b-e045-4ed0-a6b6-e6e6103eca45"
    });
  //]]>
</script><script src="./Bai19_files/getad(4)"></script><script async="" src="./Bai19_files/adsbygoogle.js.tải xuống"></script>
<!-- 300X600_rightbar -->
<ins class="adsbygoogle" style="display:inline-block;width:300px;height:600px" data-ad-client="ca-pub-2153208817642134" data-ad-slot="6376961513" data-adsbygoogle-status="done"><ins id="aswift_10_expand" style="display:inline-table;border:none;height:600px;margin:0;padding:0;position:relative;visibility:visible;width:300px;background-color:transparent;"><ins id="aswift_10_anchor" style="display:block;border:none;height:600px;margin:0;padding:0;position:relative;visibility:visible;width:300px;background-color:transparent;"><iframe width="300" height="600" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" onload="var i=this.id,s=window.google_iframe_oncopy,H=s&amp;&amp;s.handlers,h=H&amp;&amp;H[i],w=this.contentWindow,d;try{d=w.document}catch(e){}if(h&amp;&amp;d&amp;&amp;(!d.body||!d.body.firstChild)){if(h.call){setTimeout(h,0)}else if(h.match){try{h=s.upd(h,i)}catch(e){}w.location.replace(h)}}" id="aswift_10" name="aswift_10" style="left:0;position:absolute;top:0;width:300px;height:600px;" src="./Bai19_files/saved_resource(13).html"></iframe></ins></ins></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div>
</div>
</div>
</div>
<footer class="mdl-mega-footer">

<div class="mdl-mega-footer__bottom-section">
<div class="mdl-logo"><a href="https://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_US" target="_blank">This work is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.</a></div>
</div>
<div class="mdl-mega-footer__bottom-section">
<div class="mdl-logo">©w3resource.com 2011-2018</div>
<ul class="mdl-mega-footer__link-list">
<li><a href="https://www.w3resource.com/privacy.php">Privacy</a></li>
<li><a href="https://www.w3resource.com/about.php">About</a></li>
<li><a href="https://www.w3resource.com/contact.php">Contact</a></li>
<li><a href="https://www.w3resource.com/feedback.php">Feedback</a></li>
<li><a href="https://www.w3resource.com/advertise.php">Advertise</a></li>
</ul>
</div>
</footer>
</main>
</div><iframe style="display: none;" src="./Bai19_files/saved_resource(14).html"></iframe>


<link rel="stylesheet" href="./Bai19_files/icon">
<script src="./Bai19_files/material.min.js.tải xuống"></script>
<link rel="stylesheet" href="./Bai19_files/prism.css">
<script src="./Bai19_files/prism.js.tải xuống"></script>
<script>
var goTop = document.createElement("a");
goTop.innerHTML = '<i class="material-icons">&#xE5D8;</i>';
goTop.style = "bottom:0;right:27%;position:absolute;z-index: 9999";
goTop.setAttribute("href", "#h_one");
document.body.appendChild(goTop);
</script><a href="https://www.w3resource.com/java-exercises/basic/index.php#h_one" style="bottom: 0px; right: 27%; position: absolute; z-index: 9999;"><i class="material-icons"></i></a>
<link rel="stylesheet" type="text/css" href="./Bai19_files/cookieconsent.min.css">
<script src="./Bai19_files/cookieconsent.min.js.tải xuống"></script>
<script>
window.onload = function() {
//var old_links = document.getElementById("np").style.display = "none";
var links = document.querySelector("ul.nav.nav-list").childNodes;
var parentDiv = document.querySelector(".np");
//var prne_bottom = document.getElementById("previousnext_bottom");
var node = document.createElement("span"); 
node.setAttribute("class","previousNext");
parentDiv.appendChild(node);
for (var i=0; i < links.length; i++) {
if(links[i].getAttribute("class")!=="nav-header" && links[i].children[0].getAttribute('href')===window.location.pathname){
if(links[i-1].getAttribute("class")!=="nav-header"){
var newLink = document.createElement("a");
newLink.setAttribute("href",links[i-1].children[0].getAttribute("href"));
var icon = document.createElement("i");
icon.setAttribute("class","material-icons");
icon.style.marginLeft = '40px';
icon.style.color = '#fff';
icon.style.verticalAlign = 'middle';
var previousTxt = document.createTextNode('skip_previous');
icon.appendChild(previousTxt);
newLink.appendChild(icon);
node.appendChild(newLink);
}
else if (links[i-1].getAttribute("class")==="nav-header"){
var newLink = document.createElement("a");
newLink.setAttribute("href",links[i-2].children[0].getAttribute("href"));
var icon = document.createElement("i");
icon.setAttribute("class","material-icons");
icon.style.marginLeft = '40px';
icon.style.color = '#fff';
icon.style.verticalAlign = 'middle';
var previousTxt = document.createTextNode('skip_previous');
icon.appendChild(previousTxt);
newLink.appendChild(icon);
node.appendChild(newLink);
}
if(links[i+1].getAttribute("class")!=="nav-header") {
var newLink = document.createElement("a");
newLink.setAttribute("href",links[i+1].children[0].getAttribute("href"));
var icon = document.createElement("i");
icon.setAttribute("class","material-icons");
icon.style.marginLeft = '30px';
icon.style.color = '#fff';
icon.style.verticalAlign = 'middle';
var nextTxt = document.createTextNode('skip_next');
icon.appendChild(nextTxt);
newLink.appendChild(icon);
node.appendChild(newLink);
}
else if (links[i+1].getAttribute("class")==="nav-header") {
var newLink = document.createElement("a");
newLink.setAttribute("href",links[i+2].children[0].getAttribute("href"));
var icon = document.createElement("i");
icon.setAttribute("class","material-icons");
icon.style.marginLeft = '30px';
icon.style.color = '#fff';
icon.style.verticalAlign = 'middle';
var nextTxt = document.createTextNode('skip_next');
icon.appendChild(nextTxt);
newLink.appendChild(icon);
node.appendChild(newLink);
}
}
}
var prenext = document.querySelector("span.previousNext");
var cln = prenext.cloneNode(true);
//var prenextBottom = document.getElementById("previousnext_bottom");
//prenextBottom.appendChild(cln);
}	
</script>


<script src="./Bai19_files/onejs"></script><div id="amzn_assoc_ad_div_adunit_0"></div>


<table cellspacing="0" cellpadding="0" class="gstl_50 gssb_c" style="width: 196px; display: none; top: 45px; left: 1108px; position: absolute;"><tbody><tr><td class="gssb_f"></td><td class="gssb_e" style="width: 100%;"></td></tr></tbody></table><div style="display: none;"><iframe frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" class="goog_xca_frame" style="opacity: 0; transition: none; overflow: visible;" id="_no-clickjacking-0" src="./Bai19_files/saved_resource(15).html"></iframe></div></body></html>