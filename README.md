# IDMWaker_Java

<div id="readme" class="Box md js-code-block-container Box--responsive">

        <div class="d-flex flex-items-center flex-justify-between color-bg-primary js-sticky js-position-sticky top-0 border-bottom border-top-0 rounded-top-2 p-3" style="position: sticky; z-index: 99; top: 0px !important;" data-original-top="0px">
          <div class="d-flex flex-items-center">
              <details data-target="readme-toc.trigger" data-menu-hydro-click="{&quot;event_type&quot;:&quot;repository_toc_menu.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;trigger&quot;,&quot;repository_id&quot;:186362290,&quot;originating_url&quot;:&quot;https://github.com/nilaoda/IDMWaker&quot;,&quot;user_id&quot;:21048630}}" data-menu-hydro-click-hmac="f52c87dbac7f1a281c5d2785496a1dd58877a9c7aa28b3f1d56dab72eb02ccf2" class="dropdown details-reset details-overlay">
    <summary class="btn btn-outline px-2" aria-haspopup="menu" aria-label="Table of Contents" role="button">
      <svg height="16" class="octicon octicon-list-unordered" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M2 4a1 1 0 100-2 1 1 0 000 2zm3.75-1.5a.75.75 0 000 1.5h8.5a.75.75 0 000-1.5h-8.5zm0 5a.75.75 0 000 1.5h8.5a.75.75 0 000-1.5h-8.5zm0 5a.75.75 0 000 1.5h8.5a.75.75 0 000-1.5h-8.5zM3 8a1 1 0 11-2 0 1 1 0 012 0zm-1 6a1 1 0 100-2 1 1 0 000 2z"></path></svg>
    </summary>

    <details-menu class="SelectMenu" role="menu">
      <div class="SelectMenu-modal rounded-3" style="max-height:340px;">
        <div class="SelectMenu-list SelectMenu-list--borderless p-2" style="overscroll-behavior: contain;">

            <a role="menuitem" class="filter-item py-1 text-emphasized" style="padding-left: 12px;" data-action="click:readme-toc#blur" data-targets="readme-toc.entries" data-hydro-click="{&quot;event_type&quot;:&quot;repository_toc_menu.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;entry&quot;,&quot;repository_id&quot;:186362290,&quot;originating_url&quot;:&quot;https://github.com/nilaoda/IDMWaker&quot;,&quot;user_id&quot;:21048630}}" data-hydro-click-hmac="a8f23be0e9d190178414857937b81e3d8e4c3d9f142029f1d44648c4978d4b6e" href="#idmwaker" aria-current="page">IDMWaker</a>
            <a role="menuitem" class="filter-item py-1 " style="padding-left: 24px;" data-action="click:readme-toc#blur" data-targets="readme-toc.entries" data-hydro-click="{&quot;event_type&quot;:&quot;repository_toc_menu.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;entry&quot;,&quot;repository_id&quot;:186362290,&quot;originating_url&quot;:&quot;https://github.com/nilaoda/IDMWaker&quot;,&quot;user_id&quot;:21048630}}" data-hydro-click-hmac="a8f23be0e9d190178414857937b81e3d8e4c3d9f142029f1d44648c4978d4b6e" href="#功能描述">功能描述</a>
            <a role="menuitem" class="filter-item py-1 " style="padding-left: 24px;" data-action="click:readme-toc#blur" data-targets="readme-toc.entries" data-hydro-click="{&quot;event_type&quot;:&quot;repository_toc_menu.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;entry&quot;,&quot;repository_id&quot;:186362290,&quot;originating_url&quot;:&quot;https://github.com/nilaoda/IDMWaker&quot;,&quot;user_id&quot;:21048630}}" data-hydro-click-hmac="a8f23be0e9d190178414857937b81e3d8e4c3d9f142029f1d44648c4978d4b6e" href="#实现方式">实现方式</a>
            <a role="menuitem" class="filter-item py-1 " style="padding-left: 24px;" data-action="click:readme-toc#blur" data-targets="readme-toc.entries" data-hydro-click="{&quot;event_type&quot;:&quot;repository_toc_menu.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;entry&quot;,&quot;repository_id&quot;:186362290,&quot;originating_url&quot;:&quot;https://github.com/nilaoda/IDMWaker&quot;,&quot;user_id&quot;:21048630}}" data-hydro-click-hmac="a8f23be0e9d190178414857937b81e3d8e4c3d9f142029f1d44648c4978d4b6e" href="#下载">下载</a>
        </div>
      </div>
    </details-menu>

  </details>

            <h2 class="Box-title pl-3">
              <a href="#readme" class="Link--primary ">README.md</a>
            </h2>
          </div>
        </div>

          <div data-target="readme-toc.content" class="Box-body px-5 pb-5">
            <article class="markdown-body entry-content container-lg" itemprop="text"><h1><a id="user-content-idmwaker" class="anchor" aria-hidden="true" href="#idmwaker"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>IDMWaker</h1>
<p>调用IDM的<a href="http://www.internetdownloadmanager.com/support/idm_api.html" rel="nofollow">API</a>添加任务</p>
<h2><a id="user-content-功能描述" class="anchor" aria-hidden="true" href="#功能描述"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>功能描述</h2>
<p>将链接批量发送给IDM进行下载，并提供正则表达式匹配，自动增加序号等功能</p>
<p><a target="_blank" rel="noopener noreferrer" href="https://camo.githubusercontent.com/ab13e856b5e84bc57f9160490b7bf9f55b369be8a8068c6e036cd73c0e5df557/68747470733a2f2f692e6c6f6c692e6e65742f323031392f30352f31332f3563643931363564333830306136343430342e706e67"><img src="https://camo.githubusercontent.com/ab13e856b5e84bc57f9160490b7bf9f55b369be8a8068c6e036cd73c0e5df557/68747470733a2f2f692e6c6f6c692e6e65742f323031392f30352f31332f3563643931363564333830306136343430342e706e67" alt="截图" data-canonical-src="https://i.loli.net/2019/05/13/5cd9165d3800a64404.png" style="max-width:100%;"></a></p>
<h2><a id="user-content-实现方式" class="anchor" aria-hidden="true" href="#实现方式"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>实现方式</h2>
<p>1.<a href="http://www.internetdownloadmanager.com/support/download/IDMCOMAPI.zip" rel="nofollow">下载API</a><br>
2.使用<code>TlbImp.exe</code>将<code>IDManTypeInfo.tlb</code>文件转换为dll类库<br>
3.在项目中引入该类库并调用，C#核心代码如下</p>
<pre><code>new IDManLib.CIDMLinkTransmitterClass().SendLinkToIDM2(
    URL, //URL
    Referer, //Referer
    Cookies, //Cookies
    Data, //Data
    Username, //Username
    Userpassword, //Userpassword
    LocalPath, //LocalPath
    LocalFileName,  //LocalFileName
    Flag, //Flag
    UserAgent,
    null
    );
</code></pre>
<h2><a id="user-content-下载" class="anchor" aria-hidden="true" href="#下载"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>下载</h2>
<p><a href="https://github.com/nilaoda/IDMWaker/releases/latest">https://github.com/nilaoda/IDMWaker/releases/latest</a></p>
</article>
          </div>
      </div>
