package org.codehaus.mojo.natives.compiler;

/*
 * The MIT License
 *
 * Copyright (c) 2004, The Codehaus
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
*/

import java.io.File;


/*
 * CompilerConfiguration contains inputs by the user + 
 * DependencyMangement for dependecies analysis
 */
public class CompilerConfiguration
{
	
	private File providerHome;
	
	private File baseDir;
	
	/**
	 * Must be in your path
	 */
	private String executable = "";
	
	/**
	 * Will be passed to compiler executable 
	 */
	private String [] startOptions;

	private String [] middleOptions;

	private String [] endOptions;

	
	private File [] includePaths;

	private File [] systemIncludePaths;
		
	private File   outputDirectory;

	public CompilerConfiguration ()
	{
	}
		
	public File getBaseDir()
	{
		return this.baseDir;
	}
	
	public void setBaseDir( File basedir )
	{
		this.baseDir = basedir;
	}
	
	public String getExecutable()
	{
		return this.executable;
	}

	public void setExecutable ( String executable )
	{
		this.executable = executable;
	}
	
	public void setSystemIncludePaths( File [] paths )
	{
		this.systemIncludePaths = paths;
	}
	
	public File [] getSystemIncludePaths() 
	{
		if ( this.systemIncludePaths == null )
		{
			return new File[0];
		}
		
		return this.systemIncludePaths;
	}
	
	
	public void setIncludePaths ( File [] paths )
	{
		this.includePaths = paths;
	}
	
	public File [] getIncludePaths() 
	{
		if ( this.includePaths == null )
		{
			return new File[0];
		}
		
		return this.includePaths;
	}
    
	public File getOutputDirectory()
	{
		return this.outputDirectory;
	}
	
	public void setOutputDirectory( File dir )
	{
		this.outputDirectory = dir;
	}
	
	public File [] getEnvIncludePaths()
	{
		return this.getEnvIncludePaths();
	}
	
	public String [] getStartOptions()
	{
		if ( this.startOptions == null )
		{
			return new String [0];
		}
		return this.startOptions;
	}

	public void setStartOptions( String [] options )
	{
		this.startOptions = options;
	}

	public String [] getMiddleOptions()
	{
		return this.middleOptions;
	}

	public void setMiddleOptions( String [] options )
	{
		this.middleOptions = options;
	}

	public String [] getEndOptions()
	{
		return this.endOptions;
	}

	public void setEndOptions( String [] options )
	{
		this.endOptions = options;
	}

	public File getProviderHome()
	{
		return this.providerHome;
	}
	
	public void setProviderHome( File dir )
	{
		this.providerHome = dir;
	}
	
	public void setCompilerHome( File dir )
	{
		this.providerHome = dir;
	}
}
